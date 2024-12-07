package edu.miracosta.cs112.finalproject.finalproject.objectClasses;

public class User {

    // Instance Variables
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private String driversLicenseNum;

    // Default Constructor
    public User() {
        firstName = "";
        lastName = "";
        birthYear = 0;
        birthMonth = 0;
        driversLicenseNum = "";
    }

    // Full Constructor
    public User(String firstName, String lastName, int birthYear, int birthMonth, String driversLicenseNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.driversLicenseNum = driversLicenseNum;
    }

    // Getters / Accessors
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public String getDriversLicenseNum() {
        return driversLicenseNum;
    }

    // Setters / Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    public void setDriversLicenseNum(String driversLicenseNum) {
        this.driversLicenseNum = driversLicenseNum;
    }

}
