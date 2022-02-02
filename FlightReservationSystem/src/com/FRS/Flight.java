package com.FRS;

public class Flight {
    private String flightNumber, airline;
    private int capacity;
    private int bookedSeats;

    //Constructor for all the attributes
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    //getters and setters for private members
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return ("Flight Number of requested Flight: " + flightNumber + ", about: " + airline + ", with a capacity of capacity of: " + capacity + ", of which: " + bookedSeats +" seats are booked");
    }
    public boolean checkAvailability() {
        if(bookedSeats < capacity) {
            return true;
        }
        else {
            return false;
        }
    }
    //If a seat is booked
    public void book() {
        bookedSeats++;
    }
}
