import java.util.*;

public class Channel {
    private int id;
    private Event event;
    private Date createdDate;
    private List<User> users;
    private List<Message> messages;

    public Event getEvent() {
        return event;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public List<User> getUsers() {
        return users;
    }
    public void sendMessage(Message message) {
        messages.add(message);
    }

}
