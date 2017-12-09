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
 * Class representing Animal subclass Bird. 
 * Contains enumerated class bType, containing 5 varieties of bird.
 */
public class Bird extends Animal{

	public static enum bType{ PARAKEET, COCKATIEL, CANARY, PARROT, EAGLE};
	private bType bt;
	
	public Bird(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap, int t) {
		super(n, o, a, m, v, ap);
		int var = t;
		if(var == 1) {
			bt = bType.PARAKEET;
		}
		else if(var == 2) {
			bt = bType.COCKATIEL;
		}
		else if (var == 3) {
			bt = bType.CANARY;
		}
		else if (var == 4) {
			bt = bType.PARROT;
		}
		else if (var == 5) {
			bt = bType.EAGLE;
		}
	}
}
