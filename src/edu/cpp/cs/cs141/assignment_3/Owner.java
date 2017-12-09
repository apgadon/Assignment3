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
 * Class representing the entity Owner. Contains attributes name, address, and phone.
 * Contains setter methods to access attributes.
 */
public class Owner {
	String name;
	String address;
	float phone;
	
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
