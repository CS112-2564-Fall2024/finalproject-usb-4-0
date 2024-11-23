package edu.miracosta.cs112.finalproject.finalproject;

public class Vehicle {

    // Instance Variables
    private int seating;
    private int gasMileage;
    private String make;
    private String model;
    private int year;
    private int topSpeed;
    private double rentalPrice;

    // Default Constructor
    public Vehicle() {
        this.seating = 0;
        this.gasMileage = 0;
        this.make = "";
        this.model = "";
        this.year = 0;
        this.topSpeed = 0;
        this.rentalPrice = 0.0;
    }

    // Full constructor
    public Vehicle(int seating, int gasMileage, String make, String model, int year, int topSpeed, double rentalPrice) {
        this.seating = seating;
        this.gasMileage = gasMileage;
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
        this.rentalPrice = rentalPrice;
    }

    // Getters / Accessors
    public int getSeating() {
        return seating;
    }
    public int getGasMileage() {
        return gasMileage;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public double getRentalPrice() {
        return rentalPrice;
    }

    // Setters / Mutators
    public void setSeating(int seating) {
        this.seating = seating;
    }
    public void setGasMileage(int gasMileage) {
        this.gasMileage = gasMileage;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }



}
