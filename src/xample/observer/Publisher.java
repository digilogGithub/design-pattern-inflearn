package xample.observer;

public interface Publisher {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
}
