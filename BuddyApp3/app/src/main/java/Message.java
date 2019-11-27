import java.util.*;
import java.io.*;
public class Message {
    private int id;
    private String content;
    private Date createdDate;
    private User author;
    private Channel channel;
    private Boolean deleted;
    private File attachment;

    public void delete() {
        deleted = true;
    }
    public User getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }

    public Date getDate() {
        return createdDate;
    }
    public Channel getChannel() {
        return channel;
    }
    public File getAttachment() {
        return attachment;
    }

}
