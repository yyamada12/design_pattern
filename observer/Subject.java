import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public abstract void notifyObserver();
}