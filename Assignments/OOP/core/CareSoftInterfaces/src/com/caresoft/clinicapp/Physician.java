package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;

	// TO DO: Constructor that takes an IDcopy
	public Physician(int idCopy) {
		super();
		this.id = idCopy;
		this.patientNotes = new ArrayList<String>();
	}
	
	// TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		if (pin > 999 && pin < 10000) {
			this.pin = pin;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID == this.id) {
			return true;
		}
		return false;
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}




	// TO DO: Setters & Getters
}
