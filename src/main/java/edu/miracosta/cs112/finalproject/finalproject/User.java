package edu.miracosta.cs112.finalproject.finalproject;

public class User {

    // Instance Variables
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String email;
    private String driversLicenseNum;

    // Default Constructor
    public User() {
        firstName = "";
        lastName = "";
        birthYear = 0;
        birthMonth = 0;
        birthDay = 0;
        email = "";
        driversLicenseNum = "";
    }

    // Full Constructor
    public User(String firstName, String lastName, int birthYear, int birthMonth, int birthDay, String email, String driversLicenseNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.email = email;
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
    public int getBirthDay() { return birthDay; }
    public String getEmail() {
        return email;
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
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDriversLicenseNum(String driversLicenseNum) {
        this.driversLicenseNum = driversLicenseNum;
    }

}
