package week_05;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() { 
        return username;
    }

    public void sendMessage(Chat chat, String content) {
        chat.addMessage(new Message(content));
    }
}
