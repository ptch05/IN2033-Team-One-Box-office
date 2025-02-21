package com.teamoneboxoffice.interfaces;

public class Ticket
{

    private String ticketID;
    private String customerID;
    private int seatNumber;
    private int rowNumber;
    private String hall;
    private boolean eligibleForDiscount ;
    private boolean isWheelchair;
    private double price;
    private String priorityStatus;

    Ticket(String ticketID, int seatNumber, int rowNumber, boolean eligibleForDiscount, boolean isWheelchair, double price, String priorityStatus)
    {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.eligibleForDiscount = eligibleForDiscount;
        this.isWheelchair = isWheelchair;
        this.price = price;
        this.priorityStatus = priorityStatus;
    }



    public String getTicketID() {
        return ticketID;
    }
    
    public String getCustomerID() {
        return customerID;
    }
    
    public int getSeatNumber() {
        return seatNumber;
    }
    
    public int getRowNumber() {
        return rowNumber;
    }
    
    public String getHall() {
        return hall;
    }
    
    public boolean getEligibleForDiscount() {
        return eligibleForDiscount;
    }
    
    public boolean getIsWheelchair() {
        return isWheelchair;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getPriorityStatus() {
        return priorityStatus;
    }

}
