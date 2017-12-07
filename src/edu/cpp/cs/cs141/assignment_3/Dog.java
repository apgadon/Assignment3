/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

/**
 * @author Angela Gadon
 *
 */
public class Dog extends Animal{
//lol woof
	public static enum dType{LAB, POODLE, PUG, TERRIER, COLLIE};
	public dType dt;	//may bring problems with fishtype
	
	public Dog(String n, Owner o, int a, Disease[] m, String[] v, Appointment[] ap, dType t) {
		super(n, o, a, m, v, ap);
		dt = t;
	}
}
