import java.util.*;
public class EventBoard {
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void attachEvent(Event event){
        events.add(event);
    }
}
