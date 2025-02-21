package com.teamoneboxoffice.services.implementations;

import com.teamoneboxoffice.interfaces.FinancialAndUsageTracking;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of financial and usage tracking.
 * Handles discounts for various categories (NHS, Military, Local Resident)
 * and tracks revenue after discounts.
 * 
 * Data stored:
 * - revenues: Maps ticket sale ID to revenue amount
 * - discountTypes: Maps ticket sale ID to type of discount applied
 * - discountAmounts: Maps ticket sale ID to discount amount
 */
public class FinancialAndUsageTrackingImpl implements FinancialAndUsageTracking {
    private Map<String, Double> revenues = new HashMap<>();
    private Map<String, String> discountTypes = new HashMap<>();
    private Map<String, Double> discountAmounts = new HashMap<>();

    /**
     * Applies a discount to a ticket sale
     * 
     * @param ticketSalesId Unique identifier for the ticket sale
     * @param discountType Type of discount (e.g., Military, NHS, Local Resident)
     * @param discountAmount Amount to be discounted from the ticket price
     */
    @Override
    public void applyDiscount(String ticketSalesId, String discountType, double discountAmount) {
        if (revenues.containsKey(ticketSalesId)) {
            double currentRevenue = revenues.get(ticketSalesId);
            revenues.put(ticketSalesId, currentRevenue - discountAmount);
            discountTypes.put(ticketSalesId, discountType);
            discountAmounts.put(ticketSalesId, discountAmount);
        }
    }

    /**
     * Retrieves the current revenue for a ticket sale after any discounts
     * 
     * @param ticketSalesId Unique identifier for the ticket sale
     * @return Current revenue amount after discounts
     */
    @Override
    public double getTicketRevenue(String ticketSalesId) {
        return revenues.getOrDefault(ticketSalesId, 0.0);
    }
}