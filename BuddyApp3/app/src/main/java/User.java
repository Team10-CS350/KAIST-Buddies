import java.util.*;
public class User {
    private int id;
    private Date createDate;
    private String name;
    private String email;
    private boolean buddy;
    private int rating;

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public int getRate()
    {
        return rating;
    }
    public Boolean isBuddy()
    {
        return buddy;
    }
    public User(String name, String email, boolean isBuddy){
        this.name = name;
        this.email = email;
        this.buddy = isBuddy;
        Date curDate = new Date();
        this.createDate = curDate;
        this.id = 0; //ToDo: How to create an id for a user
        this.rating = 0; //ToDo: Should this be initialized
    }

}
