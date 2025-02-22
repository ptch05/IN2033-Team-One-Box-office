package com.teamoneboxoffice.services.implementations;

import com.teamoneboxoffice.interfaces.Event;
import com.teamoneboxoffice.interfaces.EventDTO;
import com.teamoneboxoffice.interfaces.EventMapper;
import com.teamoneboxoffice.interfaces.SalesOfTickets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Implementation of ticket sales functionality.
 * Responsible for tracking ticket sales against the cost of ordered films.
 * 
 * Data stored:
 * - revenues: Maps ticket sale ID to revenue amount
 * - rentalCosts: Maps ticket sale ID to film rental cost
 * - ticketNumbers: Maps ticket sale ID to number of tickets sold
 * - filmIds: Maps ticket sale ID to film identifier
 */

public class SalesOfTicketsImpl implements SalesOfTickets {
    private Map<String, Double> revenues = new HashMap<>();
    private Map<String, Double> rentalCosts = new HashMap<>();
    private Map<String, Integer> ticketNumbers = new HashMap<>();
    private Map<String, String> filmIds = new HashMap<>();

    //private List<Event> events;

    private Map<String, Double> idToCosts;



    /**
     * Records a new ticket sale in the system
     * 
     * @param ticketsSoldNumber Number of tickets sold in this transaction
     * @param ticketRevenue Total revenue from the ticket sale
     * @param filmRentalCost Cost of renting the film
     * @param filmId Unique identifier for the film
     * @return Unique identifier for the ticket sale
     */


    @Override
    public String recordTicketSale(int ticketsSoldNumber, double ticketRevenue, double filmRentalCost, String filmId) {
        String ticketSalesId = UUID.randomUUID().toString();
        revenues.put(ticketSalesId, ticketRevenue);
        rentalCosts.put(ticketSalesId, filmRentalCost);
        ticketNumbers.put(ticketSalesId, ticketsSoldNumber);
        filmIds.put(ticketSalesId, filmId);
        return ticketSalesId;
    }


    /*

    @Override
    public void recordTicketSale() {
        String ticketSalesId = UUID.randomUUID().toString();
        for(Event e : events)
        {
            if(e.getEventName().equalsIgnoreCase("Movie etc")) {
                revenues.put(ticketSalesId, e.getTicketRevenue());
                rentalCosts.put(ticketSalesId, e.getRentalCost());
                ticketNumbers.put(ticketSalesId, e.getTicketNumbers());
                filmIds.put(ticketSalesId, e.getEventID());
                return ticketSalesId;
            }
        }
    }

     */


    @Override
    public Map<String, Double> compareCosts(List<EventDTO> movieEvents)
    {
        //for(Event e : events)
        //{
            EventMapper eventDTO = new EventMapper();
            List<EventDTO> events = eventDTO.mapAllEventObjects();

            for(EventDTO e : events) {
                if (eventDTO != null) //--data transfer objects
                {
                    double rentalCost = e.getRentalCost();
                    double revenue = e.getTicketRevenue();

                    double costs = 0;

                    costs = rentalCost - revenue;

                    idToCosts.put(e.getEventID(), costs);
                }
            }

        return idToCosts;

    }
}