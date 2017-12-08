package edu.cpp.cs.cs141.assignment_3;

public class Database {

	private Animal[] patients;
	private Appointment[] schedule;
	private int scheduleLength;
	
	public Database(Animal[] p) {	//only takes in animals
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
		
		scheduleLength = schedule.length; 
	}

	public void resolveAppointment(Appointment toRemove) {
		int index = -1;
		for (int i = 0; i < scheduleLength; i++) {
			if (toRemove == schedule[i]) {
				index = i;
				break;
			}
		}
		
		if(true) {
			for(int j = index; j < scheduleLength - 1; j++) {
				schedule[j] = schedule[j + 1];	//increment other appointments to "delete" appointment
			}
		}
	}
	
	public int[] searchAppointments(String ownerName) {	//returns int[] of indexes of desired appointments
		int retLen = 0;	//length of to-be-made int[] of indexes
		for(Animal e : patients) {
			if(e.getOwner().getName().equalsIgnoreCase(ownerName))
				retLen += e.getAppointments().length;	//adds how many appts this animal has
		}
		
		int[] toReturn = new int[retLen];
		int count = 0;
		for (int i = 0; i < scheduleLength; i++) {	//for each animal in patients
			if(schedule[i].getClient().getOwner().getName().equalsIgnoreCase(ownerName)) {
				toReturn[count] = i;
				count++;
			}
		}
		return toReturn;
	}
	
	public Appointment[] searchAppointments(int m, int d, int y) {//overload by date
		int numAppts = 0;
		for(Appointment a : schedule) {
			if(true)//COMPARATOR to get number of
				numAppts++;
		}
		
		Appointment[] toReturn = new Appointment[numAppts];
		int count = 0;
		for(Appointment a : schedule) {
			if(true) {//COMPARATOR "
				toReturn[count] = a;
				count++;
			}
		}
		return toReturn;
	}
	
	public void printAppointments(Appointment[] list) {	//print appointments by list of appts
		for(Appointment p : list) {
			System.out.println("Name: " + p.getClient().getName()
					+ "\tDate: " + p.getDate().toString()
					+ "\tTime: " + p.getTime().toString() );
		}
	}
	
	public void printAppointments(int[] list) {	//print appointments by list of indexes int
		int count = 0;	//for incrementing through list
		
		for(int i = 0; i < schedule.length; i++) {
			if(i == list[count]) {
				System.out.println("Name: " + schedule[i].getClient().getName()
						+ "\tDate: " + schedule[i].getDate().toString()
						+ "\tTime: " + schedule[i].getTime().toString() );
				count++;	//increment to next desired index
			}
		}
	}
	
}
