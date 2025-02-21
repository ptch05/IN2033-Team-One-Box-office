package com.teamoneboxoffice.interfaces;

import java.util.List;

/*
interface Ticket
{
    String getTicketID();
    String getCustomerID();
    int getSeatNumber();
    int getRowNumber();
    String getHall();
    boolean getEligibleForDiscount();
    boolean getWheelchair();
    double getPrice();
    String getPriorityStatus(); //--will state if they are a VIP, etc
}

 */

public interface PrioritySeats {
    /**
     * Reserves priority seating for Lancaster friends
     * @param ticketId Unique ticket identifier
     * @param seatNumber Seat number to be reserved
     * @param priorityStatus Priority status of the reservation
     * @return boolean indicating if reservation was successful
     */
    boolean reservePrioritySeat(String ticketId, int seatNumber, String priorityStatus);

    List<Ticket> getPriorityTickets();
}

