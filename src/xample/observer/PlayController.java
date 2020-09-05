package xample.observer;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher {
    List<Observer> observerList = new ArrayList<>();
    private boolean play;

    public PlayController(boolean play) {
        this.play = play;
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0)
            observerList.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(play);
        }
    }

    public void setFlag(boolean play) {
        this.play = play;
        notifyObserver();
    }

    public boolean getFlag() {
        return play;
    }
}
