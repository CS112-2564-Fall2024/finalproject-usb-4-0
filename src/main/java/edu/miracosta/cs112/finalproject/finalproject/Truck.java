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
    public Truck(int seating, int gasMileage, String make, String model, int year, int topSpeed, double rentalPrice, int towingCapacity) {
        super(seating, gasMileage, make, model, year, topSpeed, rentalPrice);
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

}
