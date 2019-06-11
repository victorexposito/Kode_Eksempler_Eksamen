package Observer;

public class Observer implements IObserver{

    private IObservable observable = null;

    public Observer(IObservable observable){
        this.observable = observable;
    }

    @Override
    public void update() {
        gotIt();
    }

    public void gotIt(){
        System.out.println("I am notified!");
    }

    public void unsubscribe(){
        observable.removeObs(this);
    }

}
