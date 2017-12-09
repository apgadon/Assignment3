/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import edu.cpp.cs.cs141.assignment_3.Dog.dType;

/**
 * @author Angela Gadon
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting up diseases in an array for testing.
		Disease[] m = new Disease[3];
		m[0] = new Disease("fever", true);
		m[1] = new Disease("fleas", true);
		m[2] = new Disease ("heartworm", true);
		
		String[] vaccin = new String[2];
		
		
		dType x = dType.COLLIE;
		Owner own = new Owner();
		Dog dog1 = new Dog("Fido", own, 23, m, vaccin, a, x);
		Appointment app1 = new Appointment(dog1, 1, 4, 1963, 12, 10);
		Appointment app2 = new Appointment(dog1, 1, 4, 1963, 12, 10);

		Appointment[] t = dog1.getAppointments();
		System.out.println(t[0].getClient().getName());
		
	}

}
