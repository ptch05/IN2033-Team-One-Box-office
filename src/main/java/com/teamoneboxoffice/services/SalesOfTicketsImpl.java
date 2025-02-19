package com.teamoneboxoffice.services;

import com.teamoneboxoffice.interfaces.SalesOfTickets;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SalesOfTicketsImpl implements SalesOfTickets {
    private Map<String, Double> revenues = new HashMap<>();
    private Map<String, Double> rentalCosts = new HashMap<>();
    private Map<String, Integer> ticketNumbers = new HashMap<>();
    private Map<String, String> filmIds = new HashMap<>();

    @Override
    public String recordTicketSale(int ticketsSoldNumber, double ticketRevenue, double filmRentalCost, String filmId) {
        String ticketSalesId = UUID.randomUUID().toString();
        revenues.put(ticketSalesId, ticketRevenue);
        rentalCosts.put(ticketSalesId, filmRentalCost);
        ticketNumbers.put(ticketSalesId, ticketsSoldNumber);
        filmIds.put(ticketSalesId, filmId);
        return ticketSalesId;
    }
}