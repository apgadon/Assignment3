package edu.cpp.cs.cs141.assignment_3;

import java.util.Comparator;


public class AppointmentOwnerComparator implements Comparator<Appointment>{
	public int compare(Appointment x, Appointment y) {
		String xName = x.getClient().getOwner().getName();
		String yName = y.getClient().getOwner().getName();
		int lowLength;
		
		if(xName.length() > yName.length())
			lowLength = yName.length();
		else
			lowLength = xName.length();
		
		
		if(xName.equalsIgnoreCase(yName))	//if same owner name
			return 0;
		
		else {	//else, compare
			
			for(int i = 0; i < lowLength; i++) {
				if(xName.charAt(i) < yName.charAt(i))	//if, at any point, a letter of x comes earlier than y
					return -1;	//smaller x - larger y == negative
			}
			return 1;	//y was always later than x
		}
	}
}
