package com.teamoneboxoffice.interfaces;

public interface SeatingConfiguration {
    /**
     * Reviews and marks restricted view seats
     * @param seatNumber Seat to be reviewed
     * @param isRestricted Whether the seat has a restricted view
     */
    void reviewRestrictedSeat(int seatNumber, boolean isRestricted);

    /**
     * Reviews and updates accessibility arrangements
     * @param seatNumber Seat to be reviewed
     * @param accessibilityRequirements Specific accessibility needs
     */
    void reviewAccessibility(int seatNumber, String accessibilityRequirements);
}
