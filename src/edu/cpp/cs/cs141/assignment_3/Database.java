package edu.cpp.cs.cs141.assignment_3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment #3
 *
 * A collection of appointments at a veterinary office.
 * Can add, remove, sort, save, and load data.
 *
 * Angela Gadon
 */

/**
 * Class representing the "engine" holding all appointments. Can add, remove, search, and print from this class.
 */
public class Database {
	
	private Appointment[] schedule;
	private int scheduleLength;
	
	public Database() {	//initial schedule of none
		schedule = new Appointment[0];
		scheduleLength = schedule.length; 
	}

	public void addAppointment(Appointment toAdd) {	//adds new Appointment to end of list.
		scheduleLength++;
		Appointment[] hold = new Appointment[scheduleLength];
		for(int i = 0; i < schedule.length; i++) {
			hold[i] = schedule[i];
		}
		hold[scheduleLength - 1] = toAdd;
		schedule = hold;							//!!!NOT SURE IF LEGAL. Check if bound exception.
	}
	
	public void resolveAppointment(Appointment toRemove) {
		int index = -1;
		Appointment[] hold = schedule;
		for (int i = 0; i < scheduleLength; i++) {
			if (toRemove == hold[i]) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			for(int j = index; j < scheduleLength - 1; j++) {
				hold[j] = hold[j + 1];	//increment other appointments to "delete" appointment
			}
			scheduleLength--;
			schedule = new Appointment[scheduleLength];	//schedule is now 1 element smaller
			
			for(int i = 0; i < scheduleLength; i++) {
				schedule[i] = hold[i];
			}
		}
		
	}
	
	public Appointment[] searchOwnerAppointments() {
		Arrays.sort(schedule, new AppointmentOwnerComparator());
		return schedule;
	}
	
	public Appointment[] searchDateAppointments() {
		Arrays.sort(schedule, new AppointmentDateComparator());
		return schedule;
		
	}
	
	public Appointment[] getAppointments() {
		return schedule;
	}

}
