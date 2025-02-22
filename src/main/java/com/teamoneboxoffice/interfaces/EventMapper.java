package com.teamoneboxoffice.interfaces;

import java.util.List;

public class EventMapper
{
    private static List<Event> events;
    private static List<EventDTO> eventDTOS;

    private static EventDTO mapEventObjects(Event event)
    {
        if(event.getEventType().equalsIgnoreCase( "Film"));
        {
            return new EventDTO(event.getEventID(), event.getEventName(), event.getEventType(), event.getRentalCost(), event.getTicketRevenue(), event.getTicketNumbers());
        }
    }

    public static List<EventDTO> mapAllEventObjects()
    {
        for(Event e : events)
        {
            EventDTO eventObject = mapEventObjects(e);
            eventDTOS.add(eventObject);
        }
        return eventDTOS;
    }
}
