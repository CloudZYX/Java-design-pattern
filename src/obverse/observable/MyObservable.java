package obverse.observable;


import obverse.observe.MyObserver;

import java.util.Observer;

public interface MyObservable {
    /**
     * 注册观察者
     */
    public void registerObserver(MyObserver observer);

    /**
     * 注销观察者
     */
    public void removeObserver(MyObserver observer);

    public MyObservableData notifyObserver();

}
