package com.teamoneboxoffice.interfaces;

import java.util.List;
import java.util.Map;

public interface SalesOfTickets {
    /**
     * Records the sale of tickets for a film event
     * @param ticketsSoldNumber Number of tickets sold
     * @param ticketRevenue Revenue from ticket sales
     * @param filmRentalCost Cost of film rental
     * @param filmId Identifier for the film
     * @return ticketSalesId Unique identifier for the ticket sale
     */
    String recordTicketSale(int ticketsSoldNumber, double ticketRevenue,
                            double filmRentalCost, String filmId);

    Map<String, Double> compareCosts(List<EventDTO> movieEvents);
}