package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    private List<IObserver> observers = new ArrayList<IObserver>();

    private boolean cold = false;

    @Override
    public void addObs(IObserver o){
        observers.add(o);
    }

    @Override
    public void removeObs(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObs() {
        for(IObserver observer : observers){
            observer.update();
        }
    }


}
