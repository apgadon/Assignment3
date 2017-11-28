/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import java.io.IOException;

/**
 * @author Angela Gadon
 *
 */
public class Animal {
	
	public static enum Disease{NAME, STATUS};
	
	private String name;
	private Owner own;
	private int age;
	private Disease[] medicalHistory;
	private String[] vaccinations;
	private Appointment[] appointments;
	
	public String getName() {
		return name;
	}
	
	public Owner getOwner() {
		return own;
	}
	
	public int getAge() {
		return age;
	}
	
	public Disease getDisease(int i) {	//returns one disease at index i
		if(i < medicalHistory.length && i > 0)
			return medicalHistory[i];
		return null;
	}
	
	public String getVaccination(int i) {	//returns one vaccination at index i
		if(i < vaccinations.length && i > 0)
			return vaccinations[i];
		return null;
	}
	
	public Appointment[] getAppointments() {	//returns all appointments
		return appointments;
	}
	
}
