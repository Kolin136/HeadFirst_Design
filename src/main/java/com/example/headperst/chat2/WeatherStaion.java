package com.example.headperst.chat2;

import com.example.headperst.chat2.display.CurrentConditionDisplay;
import com.example.headperst.chat2.subject.WeatherData;

public class WeatherStaion {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

    weatherData.setMeasurements(80,65,30.4f);
  }

}
