/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

/**
 * @author Kataki
 *
 */

/**
 * Class representing Animal subclass Fish. 
 * Contains enumerated class fType, containing 5 varieties of fish.
 */
public class Fish extends Animal{

	public static enum fType{GOLDFISH, BETA, CATFISH, STARFISH, GUPPY};
	private fType ft;
	
	public Fish(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap, fType t) {
		super(n, o, a, m, v, ap);
		ft = t;
	}
}
