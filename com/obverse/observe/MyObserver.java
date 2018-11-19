package com.obverse.observe;

import com.obverse.observable.WeatherData;

public interface MyObserver {
    public void update(WeatherData weatherData);
}
