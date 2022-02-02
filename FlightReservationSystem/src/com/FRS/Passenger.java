package com.FRS;

public class Passenger {
    private static int idCounter;
    private int id;

    //Defining the child classes
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;

    //Initialising id with a static block
    static {
        idCounter = 0;
    }

    //Using constructor of "Passenger" to initialise the objects of child classes
    public Passenger(String addressStreet, String addressCity, String addressState, String contactName, String contactPhone, String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    //Required methods
    public int getId() {
        return this.id;
    }
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }
    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
    public static int getPassengerCount() {
        return idCounter;
    }
}
