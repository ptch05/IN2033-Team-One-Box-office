package com.teamoneboxoffice.services;

import com.teamoneboxoffice.interfaces.SeatingConfiguration;

import java.util.HashMap;
import java.util.Map;

public class SeatingConfigurationImpl implements SeatingConfiguration {
    private Map<Integer, Boolean> restrictedSeats = new HashMap<>();
    private Map<Integer, String> accessibilityRequirements = new HashMap<>();

    @Override
    public void reviewRestrictedSeat(int seatNumber, boolean isRestricted) {
        restrictedSeats.put(seatNumber, isRestricted);
    }

    @Override
    public void reviewAccessibility(int seatNumber, String requirements) {
        accessibilityRequirements.put(seatNumber, requirements);
    }
}