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
 * Class that compares Appointments by Owner name alphabetically.
 * Contains only an implementation of Comparator's compare.
 *
 */
public class AppointmentOwnerComparator implements Comparator<Appointment>{
	public int compare(Appointment x, Appointment y) {
		String xName = x.getClient().getOwner().getName();
		String yName = y.getClient().getOwner().getName();
		int lowLength;
		
		if(xName.length() > yName.length())
			lowLength = yName.length();
		else
			lowLength = xName.length();
		
		
		if(xName.equalsIgnoreCase(yName))	//if same owner name
			return 0;
		
		else {	//else, compare
			
			for(int i = 0; i < lowLength; i++) {
				if(xName.charAt(i) < yName.charAt(i))	//if, at any point, a letter of x comes earlier than y
					return -1;	//smaller x - larger y == negative
			}
			return 1;	//y was always later than x
		}
	}
}
