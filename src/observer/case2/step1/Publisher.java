package observer.case2.step1;

public interface Publisher {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
