package edu.cpp.cs.cs141.assignment_3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @author Angela Gadon
 *
 */

/**
 * Class representing the "engine" holding all appointments. Can add, remove, search, and print from this class.
 */
public class Database {

	private Animal[] patients;
	private Appointment[] schedule;
	private int scheduleLength;
	
	public Database(Animal[] p) {	//only takes in animals
		patients = p;
		int listLength = 0;
		
		for(Animal a : patients) {	//goes through every animal in list
			listLength += a.getAppointments().length;	//adds all appointments for this animal to length
		}
		
		schedule = new Appointment[listLength];
		int count = 0;
		
		for(Animal a : patients) {
			for(Appointment b : a.getAppointments()) {
				schedule[count] = b;	//adds each of this animal's appointments to schedule
				count++;
			}
		}
		
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
	
	public Appointment[] searchAppointments(String ownerName) {	//returns int[] of indexes of desired appointments
		Arrays.sort(schedule, new AppointmentOwnerComparator());
		return schedule;
	}
	
	public Appointment[] searchAppointments(int m, int d, int y, int hr, int min) {//overload by dat
		Arrays.sort(schedule, new AppointmentDateComparator());
		return schedule;
		
	}

	public void printAppointments(Appointment[] list) {	//print appointments by list of appts
		for(Appointment p : list) {
			System.out.println("Name: " + p.getClient().getName()
					+ "\tDate: " + p.getDate().toString()
					+ "\tTime: " + p.getTime().toString() );
		}
	}
	
	public void printAppointments(int[] list) {	//print appointments by list of indexes int
		int count = 0;	//for incrementing through list
		
		for(int i = 0; i < schedule.length; i++) {
			if(i == list[count]) {
				System.out.println("Name: " + schedule[i].getClient().getName()
						+ "\tDate: " + schedule[i].getDate().toString()
						+ "\tTime: " + schedule[i].getTime().toString() );
				count++;	//increment to next desired index
			}
		}
	}

}
