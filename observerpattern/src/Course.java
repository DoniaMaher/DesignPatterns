import java.util.ArrayList;
import java.util.List;

public class Course {
    private final List<Observer> observers = new ArrayList<Observer>();
    private String notification;

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
        notifyAllUsers();
    }

    public void addObserver(Observer newObserver) {
        this.observers.add(newObserver);
    }

    public void notifyAllUsers() {
        for (Observer observer : this.observers)
            observer.getnotify();

    }
}
