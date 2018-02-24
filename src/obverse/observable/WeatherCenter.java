package obverse.observable;

import obverse.observe.MyObserver;

import java.util.List;
import java.util.Observer;

public class WeatherCenter implements MyObservable {

    private List<MyObserver> observerList;

    @Override
    public void registerObserver(MyObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        int o = observerList.indexOf(observer);
        if (o >= 0){
            observerList.remove(observer);
        }
    }

    @Override
    public MyObservableData notifyObserver() {
        return null;
    }
}
