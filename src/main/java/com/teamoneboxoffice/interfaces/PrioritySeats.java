package com.teamoneboxoffice.interfaces;

public interface PrioritySeats {
    /**
     * Reserves priority seating for Lancaster friends
     * @param ticketId Unique ticket identifier
     * @param seatNumber Seat number to be reserved
     * @param priorityStatus Priority status of the reservation
     * @return boolean indicating if reservation was successful
     */
    boolean reservePrioritySeat(String ticketId, int seatNumber, String priorityStatus);
}
