/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import edu.cpp.cs.cs141.assignment_3.Dog.dType;

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
 * The main class, where the program initializes and starts a User Interface.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Database testData = new Database();
		UI testUI = new UI(testData);
		testUI.startQuery();

	}

}
