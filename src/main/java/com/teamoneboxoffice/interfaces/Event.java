package com.teamoneboxoffice.interfaces;

import java.util.Date;

public class Event
{
    private String eventID;
    private String eventType;
    private String eventName;
    private double eventPrice;
    private double ticketRevenue;
    private String hallType;
    private Date eventDate;
    private String eventTime; //--Format: HH:MM:SS
    private double rentalCost;
    private int ticketNumbers;

    Event(String eventID, String eventName, String eventType, double eventPrice, String hallType, Date eventDate, String eventTime)
    {
        this.eventID = eventID;
        this.eventType = eventType;
        this.eventPrice = eventPrice;
        this.hallType = hallType;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventName = eventName;
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
