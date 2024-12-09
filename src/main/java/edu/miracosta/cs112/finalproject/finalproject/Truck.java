package edu.miracosta.cs112.finalproject.finalproject;

public class Truck extends Vehicle {

    // Instance Variable
    private int towingCapacity;

    // Default Constructor
    public Truck() {
        super();
        towingCapacity = 0;
    }

    // Full Constructor
    public Truck(int seating, int mileRange, String make, String model, int year, int topSpeed, double rentalPrice, int towingCapacity) {
        super(seating, mileRange, make, model, year, topSpeed, rentalPrice);
        this.towingCapacity = towingCapacity;
    }

    // Getter / Accessor
    public int getTowingCapacity() {
        return towingCapacity;
    }

    // Setter / Mutator
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // Other Methods
    public String toString() {
        return String.format("Seating: %d\n\nMile Range: %d\n\nMake: %s\n\nModel: %s\n\nYear: %d\n\nTop Speed: %d mph\n\n" +
                "Towing Capacity: %d\n\n\nRental Price: $%.2f/day", getSeating(), getMileRange(), getMake(),
                getModel(), getYear(), getTopSpeed(), getTowingCapacity(), getRentalPrice());
    }
}
