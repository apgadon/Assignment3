/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

/**
 * @author Kataki
 *
 */
public class Owner {
	String name;
	String address;
	int phone;
	
	public Owner(String n, String a, int p) {
		name = n;
		address = a;
		phone = p;
	}
	
	public String getName() {
		return name;
	}
}
