package com.FRS;

public class Main {

    public static void main(String[] args) {
        Passenger P = new Passenger("69 & 420", "New Delhi", "Delhi", "IntelliJ", "2021.3.1", "awesomeCoders@Programmers.com");
        Flight F = new Flight("A42069", "notMallyaVali", 420, 69);
        Ticket RT = new RegularTicket("420-9744793", "Delhi", "Kolkata", "+2021-12-31T20:59:59.00", "+2021-12-31T23:47:59.00", "69F", 11000.69f, false, F, P, "Good Food");
        String[] S = {"Fort William", "Howrah Bridge", "Birla Planetarium", "Marble Place Mansion", "MotherHouse"};
        Ticket TT = new TouristTicket("069-9744793", "Delhi", "Kolkata", "+2021-12-31T20:59:59.00", "+2021-12-31T23:47:59.00", "69F", 11000.69f, false, F, P, "Relatives", S);
        printTicketDetails(RT);
        printTicketDetails(TT);
    }
    public static void printTicketDetails(Ticket regularTicket) {
        System.out.println("PNR number for chosen ticket: "+ regularTicket.getPNR());
    }
}
