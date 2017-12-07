/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;


/**
 * @author Kataki
 *
 */
public class Bird extends Animal{

	public static enum bType{ PARAKEET, COCKATIEL, CANARY, PARROT, EAGLE};
	private bType bt;
	
	public Bird(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap, bType t) {
		super(n, o, a, m, v, ap);
		bt = t;
	}
}
