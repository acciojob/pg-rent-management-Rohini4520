package com.driver;

public class PGDetails {
	 private int id;
	    private String name;
	    private double rent;
	    private int rooms;

	    public PGDetails() {
	    	// your code goes here
	    }

	    public PGDetails(int id, String name, double rent, int rooms) {
	    	// your code goes here
			this.id = id;
			this.name = name;
			this.rent = rent;
			this.rooms = rooms;

	    }

	    // Getters
	    public int getId() {
	    	// your code goes here
	        return id;
	    }

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
	    public void setId(int id) {
	    	// your code goes here
			this.id = id;
	    }

	    public void setName(String name) {
	    	// your code goes here
			this.name = name;
	    }

	    public void setRent(double rent) {
	    	// your code goes here
			this.rent = rent;
	    }

	    public void setRooms(int rooms) {
	    	// your code goes
			this.rooms = rooms;
	    }

	    @Override
	    public String toString() {
	    	// your code goes here
			return "PGDetails{name='" + name + "', rent=" + rent + ", rooms=" + rooms + '}';
	    }
}
