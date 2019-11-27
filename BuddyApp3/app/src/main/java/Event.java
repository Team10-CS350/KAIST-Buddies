import java.util.*;

enum EventType
{
    DINNER, PARTY, SHOPPING;
}

enum Status
{
    ACTIVE, EXPIRED, DELETED, FULL;
}
public class Event {
    private int id;
    private User author;
    private String title;
    private String descrition;
    // ToDo: private image thumbnail;
    private Channel channel;
    private List<EventType> types;
    private Status status;

    public String getTitle() {
        return title;
    }
    public User getAuthor() {
        return author;
    }
    public String getDescription() {
        return descrition;
    }
    /*
    public image getThumbnail() {
        return thumbnail;
    }
    */
    public Status getStatus() {
        return status;
    }
    public Channel getChannel() {
        return channel;
    }
    public Boolean isActive() {
        return (status == Status.ACTIVE);
    }


}
