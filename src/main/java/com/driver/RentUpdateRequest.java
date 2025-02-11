package com.driver;

public class RentUpdateRequest {
	 private double rent;

	    public RentUpdateRequest() {
	    	// your code goes here
	    }

	    public RentUpdateRequest(double rent) {
	    	// your code goes here
			this.rent = rent;
	    }

	    // Getter
	    public double getRent() {
	    	// your code goes here
	        return rent;
	    }

	    // Setter
	    public void setRent(double rent) {
	    	// your code goes here
			this.rent = rent;
	    }

	    @Override
	    public String toString() {
	    	// your code goes here
	    	return null;
	    }
}
