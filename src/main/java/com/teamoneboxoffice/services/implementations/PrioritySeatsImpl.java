package com.teamoneboxoffice.services.implementations;

import com.teamoneboxoffice.interfaces.PrioritySeats;
import com.teamoneboxoffice.interfaces.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of priority seating functionality.
 * Manages reservations for best seats held for friends of Lancaster 
 * one week after tickets go on sale.
 * 
 * Data stored:
 * - reservedSeats: Maps seat number to ticket ID
 * - priorityStatuses: Maps seat number to priority status
 */

public class PrioritySeatsImpl implements PrioritySeats {
    private Map<Integer, String> reservedSeats = new HashMap<>();
    private Map<Integer, String> priorityStatuses = new HashMap<>();

    private List<Ticket> tickets = new ArrayList<>();
    private List<Ticket> priorityTickets = new ArrayList<>();

    /**
     * Attempts to reserve a priority seat
     * 
     * @param ticketId Unique identifier for the ticket
     * @param seatNumber Number of the seat to be reserved
     * @param priorityStatus Status indicating priority level
     * @return true if reservation successful, false if seat already reserved
     */
    @Override
    public boolean reservePrioritySeat(String ticketId, int seatNumber, String priorityStatus) {
        if (reservedSeats.containsKey(seatNumber)) {
            return false;
        }
        reservedSeats.put(seatNumber, ticketId);
        priorityStatuses.put(seatNumber, priorityStatus);
        return true;
    }

    @Override
    public List<Ticket> getPriorityTickets()
    {

        //return List<Ticket>;
        for(Ticket t : tickets)
        {
            if(t.getPriorityStatus().equalsIgnoreCase("VIP"))
            {
                priorityTickets.add(t);
            }
        }

        return priorityTickets;
    }

}