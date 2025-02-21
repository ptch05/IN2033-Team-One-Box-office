package com.teamoneboxoffice.services.implementations;

import com.teamoneboxoffice.interfaces.PrioritySeats;

import java.util.HashMap;
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
}