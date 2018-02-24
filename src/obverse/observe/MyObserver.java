package obverse.observe;

import obverse.observable.WeatherData;

public interface MyObserver {
    public void update(WeatherData weatherData);
}
