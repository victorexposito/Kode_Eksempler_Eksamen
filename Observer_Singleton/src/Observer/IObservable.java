package Observer;

public interface IObservable {

    public void addObs(IObserver o);
    public void removeObs(IObserver o);
    public void notifyObs();
}
