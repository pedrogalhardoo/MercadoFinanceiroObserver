import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;
    private String id; 

    public Acao(String id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public String getId() {
        return id;
    }
}
