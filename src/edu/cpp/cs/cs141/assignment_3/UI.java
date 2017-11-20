package edu.cpp.cs.cs141.assignment_3;

public class UI {

	public Animal[] patients;
	public Appointment[] schedule;
	int listLength;	//amount of appointments for all animals
	
	public Appointment[] listAppointments() {
		Appointment[] allAppts = new Appointment[listLength];
		//for each animal, add all appointments
		return allAppts;
	}
	
	public void resolveAppointment(Appointment toRemove) {
		//use searchAppointment to find toRemove
	}
	
	public Appointment[] searchAppointments(String ownerName) {
		for (Animal p : patients) {	//for each animal in patients
			if(ownerName.equalsIgnoreCase( p.getOwner().getName() ) )
				return p.getAppointments();
		}
		return null;
	}
	
	public Appointment[] searchAppointments(int m, int d, int y) {//overload by date
		Appointment[] toReturn = new Appointment[0];
		//code
		return toReturn;
	}
}
