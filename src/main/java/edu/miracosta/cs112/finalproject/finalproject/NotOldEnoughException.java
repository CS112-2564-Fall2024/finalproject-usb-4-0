package edu.miracosta.cs112.finalproject.finalproject;

public class NotOldEnoughException extends Exception {
    public NotOldEnoughException() {
        super("You must be 21 years or older to rent!");
    }
    public NotOldEnoughException(String message) {
        super(message);
    }
}