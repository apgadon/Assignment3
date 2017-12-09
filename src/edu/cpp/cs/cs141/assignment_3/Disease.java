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
 * Class representing Entity Disease, used in an array in the Animal class.
 * Contains name and boolean status, where true means current and false means past.
 */
public class Disease {
	private String name;
	private boolean status;
	
	public Disease(String n, boolean s) {
		name = n;
		status = s;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	/**
	 * "Cures" of this disease, meaning status is now false/past.
	 */
	public void cured() {
		status = false;
	}
}
