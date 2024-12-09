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
        return String.format("Seating: %d\n\nEV Range: %d\n\nMake: %s\n\nModel: %s\n\nYear: %d\n\nTop Speed: %d mph" +
                "\n\nTrunk Space: %d cubic feet\n\nCharge Time (0%% → 100%%): %d minutes\n\n\nRental Price: $%.2f/day",
                getSeating(), getMileRange(), getMake(), getModel(), getYear(), getTopSpeed(), getTrunkSpace(), getChargeTime(), getRentalPrice());
    }
}
