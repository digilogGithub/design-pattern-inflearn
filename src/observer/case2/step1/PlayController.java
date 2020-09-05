package observer.case2.step1;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher {
    private List<Observer> observerList = new ArrayList<>();
    private boolean play;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        observerList.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(play);
        }
    }

    public void setFlag(boolean play) {
        this.play = play;
        notifyObservers();
    }

    public boolean getFlag() {
        return play;
    }
}
