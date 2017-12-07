/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

/**
 * @author Kataki
 *
 */
public class Disease {
	private String name;
	private boolean status;	//0 == past, 1 == current
	
	public Disease(String n, boolean s) {
		name = n;
		status = s;
	}
}
