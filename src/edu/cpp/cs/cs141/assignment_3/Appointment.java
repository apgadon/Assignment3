/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

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
 * Class representing the entity Appointment, containing the date, time, and client (animal).
 * Contains setter methods to access its attributes.
 */
public class Appointment {
	int[] date;
	int[] time;
	Animal client;
	
	public Appointment(Animal c, int month, int day, int year, int hour, int minute){
		client = c;
		
		date = new int[3];
		date[0] = month;
		date[1] = day;
		date[2] = year;
		
		time = new int[2];
		time[0] = hour;
		time[1] = minute;
	}
	
	public int[] getDate() {
		return date;
	}
	
	public int[] getTime() {
		return time;
	}
	
	public Animal getClient() {
		return client;
	}
}
