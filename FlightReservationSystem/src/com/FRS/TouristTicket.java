package com.FRS;

import java.time.LocalDateTime;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocation;

    //Constructor chaining to get the data for RegularTicket's inherited attributes and initialising class-specific attributes
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger, String hotelAddress, String[] selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    //getters and setters
    public String getHotelAddress() {
        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    //other required methods for the logic
    public String[] removeTouristLocation(String removeMe) {
        int index=0;
        int length = selectedTouristLocation.length - 1;
        String[] changedArray = new String[length];

        for (int i = 0; i < length; i++) {
            if (selectedTouristLocation[i].equals(removeMe)) {
                index = i;
                break;
            }
        }

        for (int i = 0, k = 0; i<=length; i++) {
            if (i == index) {
                continue;
            }
            changedArray[k++] = selectedTouristLocation[i];
        }

        return (changedArray);
    }
    public void addTouristLocation(String addMe) {
        int index = 0;
        for (int i=0; i< selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            selectedTouristLocation[index] = addMe;
        }
    }
}
