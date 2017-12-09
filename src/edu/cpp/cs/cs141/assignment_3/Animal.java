/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import java.io.IOException;

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
 * Class representing the Animal Entity. Contains anima's name, owner, age, history, vaccinations, and appointments.
 * Can return these field variables in its setter methods.
 */
public class Animal {
	
	private String name;
	private Owner own;
	private int age;
	private Disease[] medicalHistory;
	private String[] vaccinations;
	private Appointment[] appointments;
	
	public Animal(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap) {
		name = n;
		own = o;
		age = a;
		medicalHistory = m;
		vaccinations = v;
		appointments = ap;
	}
	
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
		if(i < medicalHistory.length && i >= 0)
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
