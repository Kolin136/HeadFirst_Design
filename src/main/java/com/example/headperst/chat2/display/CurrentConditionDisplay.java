package com.example.headperst.chat2.display;

import com.example.headperst.chat2.observer.Observer;
import com.example.headperst.chat2.subject.WeatherData;

public class CurrentConditionDisplay implements Observer,DisplayElement {
  private float temperature;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("현재 상태: 온도 " + temperature + "F,습도 " + humidity + "%");

  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      display();
  }
}
