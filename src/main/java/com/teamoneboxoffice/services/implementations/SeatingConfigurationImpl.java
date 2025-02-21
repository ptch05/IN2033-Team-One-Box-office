package com.teamoneboxoffice.services.implementations;

import com.teamoneboxoffice.interfaces.SeatingConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of seating configuration management.
 * Reviews and manages restricted view seats and accessibility requirements.
 * Base seating configuration is managed by operations teams, this implementation
 * focuses on restricted view and accessibility reviews.
 * 
 * Data stored:
 * - restrictedSeats: Maps seat number to restricted view status
 * - accessibilityRequirements: Maps seat number to accessibility requirements
 */

public class SeatingConfigurationImpl implements SeatingConfiguration {
    private Map<Integer, Boolean> restrictedSeats = new HashMap<>();
    private Map<Integer, String> accessibilityRequirements = new HashMap<>();

    /**
     * Reviews and marks seats as having restricted view
     * 
     * @param seatNumber Number of the seat to be reviewed
     * @param isRestricted Whether the seat has a restricted view
     */
    @Override
    public void reviewRestrictedSeat(int seatNumber, boolean isRestricted) {
        restrictedSeats.put(seatNumber, isRestricted);
    }

     /**
     * Reviews and records accessibility requirements for seats
     * 
     * @param seatNumber Number of the seat to be reviewed
     * @param requirements Specific accessibility requirements for the seat
     */
    @Override
    public void reviewAccessibility(int seatNumber, String requirements) {
        accessibilityRequirements.put(seatNumber, requirements);
    }
}