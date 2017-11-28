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
	float phone;				//!!!!CHECK BEST DATA TYPE FOR PHONE (take 0s into account)!!!!!
	
	public Owner() {
		name = "NoNameOwner";
		address = "nowhere";
		phone = 0;
	}
	public Owner(String n, String a, int p) {
		name = n;
		address = a;
		phone = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public float getPhone() {
		return phone;
	}
}
