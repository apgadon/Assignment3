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
 * Class representing Animal subclass Fish. 
 * Contains enumerated class fType, containing 5 varieties of fish.
 */
public class Fish extends Animal{

	public static enum fType{GOLDFISH, BETA, CATFISH, STARFISH, GUPPY};
	private fType ft;
	
	public Fish(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap, int t) {
		super(n, o, a, m, v, ap);
		int var = t;
		if(var == 1) {
			ft = fType.GOLDFISH;
		}
		else if(var == 2) {
			ft = fType.BETA;
		}
		else if (var == 3) {
			ft = fType.CATFISH;
		}
		else if (var == 4) {
			ft = fType.STARFISH;
		}
		else if (var == 5) {
			ft = fType.GUPPY;
		}
	}
}
