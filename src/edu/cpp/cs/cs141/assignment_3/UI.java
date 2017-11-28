package edu.cpp.cs.cs141.assignment_3;

public class UI {

	public Animal[] patients;
	public Appointment[] schedule;
	
	public UI(Animal[] p) {	//only takes in animals
		patients = p;
		int listLength = 0;
		
		for(Animal a : patients) {	//goes through every animal in list
			listLength += a.getAppointments().length;	//adds all appointments for this animal to length
		}
		
		schedule = new Appointment[listLength];
		int count = 0;
		
		for(Animal a : patients) {
			for(Appointment b : a.getAppointments()) {
				schedule[count] = b;	//adds each of this animal's appointments to schedule
				count++;
			}
		}
		
	}
	
	public void listAppointments() {
		for(Appointment p : schedule) {
			System.out.println("Name: " + p.getClient().getName()
					+ "\tDate: " + p.getDate().toString()
					+ "\tTime: " + p.getTime().toString() );
		}
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
