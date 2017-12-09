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
 * Class that represents Animal subclass Dog.
 * Contains enumerated class dType, for variation of dog.
 *
 */
public class Dog extends Animal{
	public static enum dType{LAB, POODLE, PUG, TERRIER, COLLIE};
	public dType dt;
	
	public Dog(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap, int t) {
		super(n, o, a, m, v, ap);
		int var = t;
		if(var == 1) {
			dt = dType.LAB;
		}
		else if(var == 2) {
			dt = dType.POODLE;
		}
		else if (var == 3) {
			dt = dType.PUG;
		}
		else if (var == 4) {
			dt = dType.TERRIER;
		}
		else if (var == 5) {
			dt = dType.COLLIE;
		}
	}
}
