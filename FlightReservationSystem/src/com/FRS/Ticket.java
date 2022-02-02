package com.FRS;

import java.time.LocalDateTime;

public class Ticket {
    private String pnr, from, to, departureDateTime, arrivalDateTime, seatNo;
    private float price;
    private boolean cancelled;
    private Passenger passenger; //Applying aggregation
    private Flight flight;

    //Constructor to initialise all attributes
    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    //Required methods
    public String checkStatus() {
        if(this.cancelled==true) {
            return("Cancelled");
        } else {
            return("Confirmed");
        }
    }
    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 + (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    //getters and setters for private attributes
    public String getPNR() {
        return pnr;
    }
    public void setPNR(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Flight getFlightDetails() {
        return flight;
    }

    public Passenger getPassengerDetails() {
        return passenger;
    }

    public boolean getCancelled() {
        return (cancelled?true: false);
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
