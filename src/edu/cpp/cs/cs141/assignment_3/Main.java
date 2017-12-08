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
		
		
		Appointment[] a = new Appointment[2];
		//int month, int day, int year, int hour, int minute
		String[] vaccin = new String[2];
		Disease[] m = new Disease[3];
		Disease meml = new Disease("measles", true);
		m[0] = meml;
		m[1] = meml;
		dType x = dType.COLLIE;
		Owner own = new Owner();
		Dog testl = new Dog("fuckin ", own, 23, m, vaccin, a, x);
		Appointment app1 = new Appointment(testl, 1, 4, 1963, 12, 10);
		Appointment app2 = new Appointment(testl, 1, 4, 1963, 12, 10);
		a[0] = app1;
		a[1] = app2;
		
		Appointment[] t = testl.getAppointments();
		System.out.println(t[0].getClient().getName());
	}

}
