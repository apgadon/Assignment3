/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import java.util.Comparator;

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
 * Class for comparing appointments by date. Contains one method, compare, 
 * which returns the difference between two Appointments.
 */
public class AppointmentDateComparator implements Comparator<Appointment>{
/**
 * Returns 0 if equal, otherwise the difference between the first different digit of x and y
 */
	public int compare(Appointment x, Appointment y) {	//[month][day][year]
		
		if(x.getDate()[2] == y.getDate()[2]) {	//year
			if(x.getDate()[0] == y.getDate()[0]) {	//month
				if(x.getDate()[1] == y.getDate()[1]) {	//day
					return 0;
				}
				return (x.getDate()[1] - y.getDate()[1]);
			}
			return (x.getDate()[0] - y.getDate()[0]);
		}
		return (x.getDate()[2] - y.getDate()[2]);
	}

}


