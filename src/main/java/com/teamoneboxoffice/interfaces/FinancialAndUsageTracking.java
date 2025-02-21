package com.teamoneboxoffice.interfaces;

public interface FinancialAndUsageTracking {
    /**
     * Applies a discount to a ticket sale
     * @param ticketSalesId ID of the ticket sale
     * @param discountType Type of discount (Military, NHS, Local Resident)
     * @param discountAmount Amount to be discounted
     */
    void applyDiscount(String ticketSalesId, String discountType, double discountAmount);

    /**
     * Gets the total revenue for a ticket sale
     * @param ticketSalesId ID of the ticket sale
     * @return Total revenue after any discounts
     */
    double getTicketRevenue(String ticketSalesId);
}
