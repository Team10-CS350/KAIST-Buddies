import java.util.*;

enum EventType
{
    DINNER, PARTY, SHOPPING;
}

enum EventStatus
{
    ACTIVE, EXPIRED, DELETED, FULL;
}
public class Event {
    private int id;
    private User author;
    private String title;
    private String description;
    // ToDo: private image thumbnail;

    // The event channel is used to know event participants.
    private Channel channel;
    private List<EventType> types;
    private EventStatus status;

    public String getTitle() {
        return title;
    }
    public User getAuthor() {
        return author;
    }
    public String getDescription() {
        return description;
    }
    public List<User> getParticipants() { return channel.getUsers(); }

    /*
    public image getThumbnail() {
        return thumbnail;
    }
    */
    public EventStatus getStatus() {
        return status;
    }
    public Channel getChannel() {
        return channel;
    }
    public Boolean isActive() {
        return (status == EventStatus.ACTIVE);
    }


}
