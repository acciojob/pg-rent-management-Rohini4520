package com.driver;

public class PGDetailsRequest {
	private String name;
    private double rent;
    private int rooms;

    public PGDetailsRequest() {
    	// your code goes here
    }

    public PGDetailsRequest(String name, double rent, int rooms) {
    	// your code goes here
        this.name = name;
        this.rent = rent;
        this.rooms = rooms;
    }

    // Getters
    public String getName() {
    	// your code goes here
        return name;
    }

    public double getRent() {
    	// your code goes here
        return rent;
    }

    public int getRooms() {
    	// your code goes here
        return rooms;
    }

    // Setters
    public void setName(String name) {
    	// your code goes here
        this.name = name;
    }

    public void setRent(double rent) {
    	// your code goes here
        this.rent = rent;
    }

    public void setRooms(int rooms) {
    	// your code goes here
        this.rooms = rooms;
    }

    @Override
    public String toString() {
    	// your code goes here
        return "PGDetailsRequest{name='" + name + "', rent=" + rent + ", rooms=" + rooms + '}';
    }
}
