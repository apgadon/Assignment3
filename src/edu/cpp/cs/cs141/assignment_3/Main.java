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
		
		Disease[] m = new Disease[3];
		String[] vaccin = new String[2];
		Appointment[] a = new Appointment[3];
		
		dType x = dType.COLLIE;
		Owner own = new Owner();
		Dog dog1 = new Dog("Fido", own, 23, m, vaccin, a, x);
		
		m[0] = new Disease("fever", true);
		m[1] = new Disease("fleas", true);
		m[2] = new Disease ("heartworm", true);
		
		vaccin[0] = "vaccine1";
		vaccin[1] = "vaccine2";
		
		a[0] = new Appointment(dog1, 1, 4, 1963, 12, 10);
		a[1] = new Appointment(dog1, 1, 10, 1968, 3, 00);
		a[2] = new Appointment(dog1, 2, 14, 1965, 10, 30);
		
		
		
	}

}
