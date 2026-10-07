package week_05;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private String name;
    private List<Message> messages = new ArrayList<>();

    public Chat(String name) {
        this.name = name;
    }

    public void addMessage(Message msg) {
        messages.add(msg);
    }

    public String getName() {
        return name;
    }
}
