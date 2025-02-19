package com.teamoneboxoffice.services;

import com.teamoneboxoffice.interfaces.PrioritySeats;

import java.util.HashMap;
import java.util.Map;

public class PrioritySeatsImpl implements PrioritySeats {
    private Map<Integer, String> reservedSeats = new HashMap<>();
    private Map<Integer, String> priorityStatuses = new HashMap<>();

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