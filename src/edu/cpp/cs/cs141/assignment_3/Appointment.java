/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

/**
 * @author Kataki
 *
 */
public class Appointment {
	int[] date;
	int[] time;
	
	public Appointment(int month, int day, int year, int hour, int minute){
		date = new int[3];
		date[0] = month;
		date[1] = day;
		date[2] = year;
		
		time = new int[2];
		time[0] = hour;
		time[1] = minute;
	}
}
