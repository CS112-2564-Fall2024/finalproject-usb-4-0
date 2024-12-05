package edu.miracosta.cs112.finalproject.finalproject;

public class EVSUV extends Vehicle {

    // Instance Variables
    private int trunkSpace;
    private int chargeTime;

    // Default Constructor
    public EVSUV() {
        super();
        trunkSpace = 0;
        chargeTime = 0;
    }

    // Full Constructor
    public EVSUV(int seating, int mileRange, String make, String model, int year, int topSpeed, double rentalPrice, int trunkSpace, int chargeTime) {
        super(seating, mileRange, make, model, year, topSpeed, rentalPrice);
        this.trunkSpace = trunkSpace;
        this.chargeTime = chargeTime;
    }

    // Getters / Accessors
    public int getTrunkSpace() {
        return trunkSpace;
    }
    public int getChargeTime() {
        return chargeTime;
    }

    // Setters / Mutators
    public void setTrunkSpace(int trunkSpace) {
        this.trunkSpace = trunkSpace;
    }
    public void setChargeTime(int chargeTime) {
        this.chargeTime = chargeTime;
    }

    // Other Methods
    public String toString() {
        return String.format("Seating: %d\nEV Range: %d\nMake: %s\nModel: %s\nYear: %d\nTop Speed: %d mph\nTrunk Space: %d cubic feet\nCharge Time (0%% → 100%%): %d minutes\n\nRental Price: $%.2f/day", getSeating(), getMileRange(), getMake(), getModel(), getYear(), getTopSpeed(), getTrunkSpace(), getChargeTime(), getRentalPrice());
    }

}
