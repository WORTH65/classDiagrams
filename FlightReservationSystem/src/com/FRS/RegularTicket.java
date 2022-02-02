package com.FRS;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
    private String specialServices;

    //Constructor chaining to get the data for RegularTicket's inherited attributes and initialising class-specific attributes
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.specialServices = specialServices;
    }

    //getters and setters
    public String getSpecialServices() {
        return specialServices;
    }
    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
