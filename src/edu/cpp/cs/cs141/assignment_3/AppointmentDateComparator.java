/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import java.util.Comparator;

/**
 * @author Angela Gadon
 *
 */

/**
 * Class for comparing appointments by date. Contains one method, compare, 
 * which returns the difference between two Appointments.
 */
public class AppointmentDateComparator implements Comparator<Appointment>{
/**
 * Returns 0 if equal, otherwise the difference between the first different digit of x and y
 */
	public int compare(Appointment x, Appointment y) {	//[month][day][year] [hour][minute]
		
		if(x.getDate()[2] == y.getDate()[2]) {	//year
			if(x.getDate()[0] == y.getDate()[0]) {	//month
				if(x.getDate()[1] == y.getDate()[1]) {	//day
					return 0;
				}
				return (x.getDate()[1] - y.getDate()[1]);
			}
			return (x.getDate()[0] - y.getDate()[0]);
		}
		return (x.getDate()[2] - y.getDate()[2]);
	}

}


