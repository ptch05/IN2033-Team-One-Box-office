package com.teamoneboxoffice.interfaces;

import java.util.Date;

public class EventDTO
{
    private String eventID;
    private String eventType;
    private String eventName;
    //private double eventPrice;
    private double ticketRevenue;
    private double rentalCost;
    private int ticketNumbers;

    EventDTO(String eventID, String eventName, String eventType, double rentalCost, double ticketRevenue, int ticketNumbers)
    {
        this.eventID = eventID;
        this.eventType = eventType;
        //this.eventPrice = eventPrice;
        this.eventName = eventName;
        this.rentalCost = rentalCost;
        this.ticketRevenue = ticketRevenue; //--initially set to null
        this.ticketNumbers = ticketNumbers;
    }

    public String getEventID() {
        return eventID;
    }

    public String getEventType() {
        return eventType;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public double getTicketRevenue() {
        return ticketRevenue;
    }

    public int getTicketNumbers() {
        return ticketNumbers;
    }

    public String getEventName() {
        return eventName;
    }
}
