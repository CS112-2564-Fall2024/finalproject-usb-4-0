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
    public EVSUV(int seating, int gasMileage, String make, String model, int year, int topSpeed, double rentalPrice, int trunkSpace, int chargeTime) {
        super(seating, gasMileage, make, model, year, topSpeed, rentalPrice);
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

}
