package com.Assignment6;

class Patient {
    int patientId;
    String patientName;
    int age;

    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    public double calculateTreatmentCost() {
        return 500.0; 
    }
}

class InPatient extends Patient {
    int numberOfDays;
    double roomCharge;

    public InPatient(int patientId, String patientName, int age, int numberOfDays, double roomCharge) {
        super(patientId, patientName, age);
        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateTreatmentCost() {
        return super.calculateTreatmentCost() + (numberOfDays * roomCharge);
    }
}

class OutPatient extends Patient {
    double consultationFee;
    double medicineCost;

    public OutPatient(int patientId, String patientName, int age, double consultationFee, double medicineCost) {
        super(patientId, patientName, age);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    public double calculateTreatmentCost() {
        return super.calculateTreatmentCost() + consultationFee + medicineCost;
    }
}

public class Q4 {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient(1001, "John Doe", 45, 5, 2000.0);
        System.out.println("In-Patient Details:");
        System.out.println("ID: " + inPatient.patientId + " | Name: " + inPatient.patientName + " | Age: " + inPatient.age);
        System.out.println("Days Admitted: " + inPatient.numberOfDays + " | Room Charge/Day: Rs. " + inPatient.roomCharge);
        System.out.println("Total Treatment Cost (incl. Rs. 500 base fee): Rs. " + inPatient.calculateTreatmentCost());
        
        System.out.println();

        OutPatient outPatient = new OutPatient(1002, "Jane Smith", 30, 800.0, 1500.0);
        System.out.println("Out-Patient Details:");
        System.out.println("ID: " + outPatient.patientId + " | Name: " + outPatient.patientName + " | Age: " + outPatient.age);
        System.out.println("Consultation Fee: Rs. " + outPatient.consultationFee + " | Medicine Cost: Rs. " + outPatient.medicineCost);
        System.out.println("Total Treatment Cost (incl. Rs. 500 base fee): Rs. " + outPatient.calculateTreatmentCost());
    }
}