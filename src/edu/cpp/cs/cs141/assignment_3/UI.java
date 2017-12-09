/**
 * 
 */
package edu.cpp.cs.cs141.assignment_3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.cpp.cs.cs141.assignment_3.Dog.dType;

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
 * 
 * Class that represents the user interface. Contains database and allows for all
 * database behaviors, as well as saving and loading.
 *
 */
public class UI {

	private Database dat;
	Scanner scan;
	/**
	 * Path to folder of save files.
	 */
	private static final String savePath = new String(System.getProperty("user.home") + File.separator + "Documents" + File.separator + "VetData");
	public UI(Database d) {
		dat = d;
		scan = new Scanner(System.in);
	}
	
	/**
	 * Asks the user what to do by scanner.
	 */
	public void startQuery() {
		System.out.println("What would you like to do?\n"
				+ "1. Add an appointment\n2. See all appointments\n3. Search appointments\n"
				+ "4. Save schedule\n5. Load a schedule\n6. Quit");
		try {
			turn(scan.nextInt());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Executes the user's choice from startQuery.
	 * @param i	The user's choice as an int.
	 */
	public void turn(int i) {
		if(i == 1) {
			makeAppointment();
		}
		else if(i == 2) {
			printAppointments();
		}
		else if(i == 3) {
			search();
		}
		else if(i == 4) {
			System.out.println("What is the file name?");
			saveGame(scan.nextLine());
		}
		else if(i == 5) {
			System.out.println("What would you like to name the file?");
			loadGame(scan.nextLine());			
		}
		else if(i == 6) {
			System.out.close();
		}
	}
	
	public void makeAppointment() {
		Animal n;
		try {
			System.out.println("What type of animal?\n1. Dog\n2. Bird\n3. Fish");
			int type = scan.nextInt();
			System.out.println("What is its name?");
			String nam = scan.nextLine();
			System.out.println("What is its age?");
			int ag = scan.nextInt();
			System.out.println("What type of dog?\n1. LAB\n2. POODLE\n3. PUG\n4. TERRIER\n5. COLLIE");
			if(type == 1) {
				n = new Dog(nam, null, ag, null, null, null, scan.nextInt());
			}
			if(type == 1) {
				n = new Bird(nam, null, ag, null, null, null, scan.nextInt());
			}
			if(type == 1) {
				n = new Fish(nam, null, ag, null, null, null, scan.nextInt());
			}
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}finally {
			startQuery();
		}	
	}
	
	/**
	 * Sorts the schedule based on date or name, as specified by the user.
	 */
	public void search() {
		System.out.println("Search by 1) date, 2) name, or 3) type?");
		int ch = scan.nextInt();
		if(ch == 1) {
			dat.searchDateAppointments();
		}
		else if (ch == 2) {
			dat.searchOwnerAppointments();
		}
		else {
			System.out.println("Invalid answer.");
		}
	}
	
	/**
	 * Saves the game using output stream.
	 * @param fileName The name to be given to the new file.
	 */
	public void saveGame(String fileName) {
		try {
			FileOutputStream out = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(dat);
		} catch (IOException e) {
			System.out.println("Unable to save.");
		}
	}
	
	/**
	 * Loads a game from its name.
	 * @param fileName The name of the existing file.
	 */
	public void loadGame(String fileName) {
		try {
			FileInputStream out = new FileInputStream(fileName);
			ObjectInputStream oos = new ObjectInputStream(out);
			dat = (Database) oos.readObject();
		} catch (IOException e) {
			System.out.println("Unable to load.");
		}
		 catch (ClassNotFoundException e) {
			System.out.println("Unable to load.");
		}
	}
	
	/**
	 * Prints appointments from database
	 */
	public void printAppointments() {	
		for(Appointment p : dat.getAppointments()) {
			System.out.println("Name: " + p.getClient().getName()
					+ "\tDate: " + p.getDate().toString()
					+ "\tTime: " + p.getTime().toString() );
		}
	}
	
}
