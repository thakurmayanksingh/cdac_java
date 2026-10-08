package com.Assignment5;

class Person {
	
	int personId;
	String personName;
	int age;
	
	public Person(int personId, String personName, int age) {
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}
	
	void displayPersonDetails() {
		System.out.println("Person ID: " + personId);
		System.out.println("Person Name: " + personName);
		System.out.println("Age: " + age);
	}
	
	void checkAge() {
		if (age >= 18) {
			System.out.println("Status: Adult");
		} else {
			System.out.println("Status: Minor");
		}
	}
}

class Doctor extends Person {
	
	String specialization;
	double consultationFee;

	public Doctor(int personId, String personName, int age, String specialization, double consultationFee) {
		super(personId, personName, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	double calculateConsultationAmount() {
		return consultationFee;
	}
	
	void displayDoctorDetails() {
		displayPersonDetails();
		System.out.println("Specialization: " + specialization);
		System.out.println("Consultation Fee: " + consultationFee);
		System.out.println("Total Consultation Amount: " + calculateConsultationAmount());
	}
}

class Patient extends Person {
	
	String disease;
	int roomNumber;

	public Patient(int personId, String personName, int age, String disease, int roomNumber) {
		super(personId, personName, age);
		this.disease = disease;
		this.roomNumber = roomNumber;
	}
	
	double calculateRoomCharge() {
		return 2000.0;
	}
	
	void displayPatientDetails() {
		displayPersonDetails();
		System.out.println("Disease: " + disease);
		System.out.println("Room Number: " + roomNumber);
		System.out.println("Room Charge: " + calculateRoomCharge());
	}
}

public class Q5 {
	public static void main(String[] args) {
		Doctor doctor = new Doctor(101, "Dr. Sanjay Gupta", 45, "Cardiologist", 1500.0);
		doctor.displayDoctorDetails();
		doctor.checkAge();
		
		System.out.println();
		
		Patient patient = new Patient(201, "Amit Kumar", 30, "Viral Fever", 305);
		patient.displayPatientDetails();
		patient.checkAge();
	}
}