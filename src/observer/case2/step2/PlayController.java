package observer.case2.step2;

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
//        for (int i = 0; i < observerList.size(); i++) {
//            observerList.get(i).update(play);
//        }
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
