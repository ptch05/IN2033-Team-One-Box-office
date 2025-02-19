package com.teamoneboxoffice.services;

import com.teamoneboxoffice.interfaces.FinancialAndUsageTracking;

import java.util.HashMap;
import java.util.Map;

public class FinancialAndUsageTrackingImpl implements FinancialAndUsageTracking {
    private Map<String, Double> revenues = new HashMap<>();
    private Map<String, String> discountTypes = new HashMap<>();
    private Map<String, Double> discountAmounts = new HashMap<>();

    @Override
    public void applyDiscount(String ticketSalesId, String discountType, double discountAmount) {
        if (revenues.containsKey(ticketSalesId)) {
            double currentRevenue = revenues.get(ticketSalesId);
            revenues.put(ticketSalesId, currentRevenue - discountAmount);
            discountTypes.put(ticketSalesId, discountType);
            discountAmounts.put(ticketSalesId, discountAmount);
        }
    }

    @Override
    public double getTicketRevenue(String ticketSalesId) {
        return revenues.getOrDefault(ticketSalesId, 0.0);
    }
}