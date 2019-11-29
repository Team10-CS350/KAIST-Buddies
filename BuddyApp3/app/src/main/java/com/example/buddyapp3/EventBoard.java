package com.example.buddyapp3;

import java.util.*;
public class EventBoard {
    private List<Event> events;

    public EventBoard() {
            events = new ArrayList<Event>();
    }
    public static EventBoard fromEventList (List<Event> eventList) {
        EventBoard eventB = new EventBoard();
        for (Event event: eventList) {
            eventB.attachEvent(event);
        }
        return eventB;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void attachEvent(Event event){
        events.add(event);
    }
}
