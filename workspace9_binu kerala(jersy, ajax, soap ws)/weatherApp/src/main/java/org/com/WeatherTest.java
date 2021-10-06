package org.com;

import java.io.IOException;
import org.json.JSONException;
import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;

public class WeatherTest {
  public static final void main(String[] args) {
    boolean isMetric = true;
//    String owmApiKey = "667bf61da8fa0bad7a21534ae9034880"; /* YOUR OWM API KEY HERE */
    String owmApiKey = "9497495fcb2dd582affb661398fb07ad"; /* YOUR OWM API KEY HERE */
    String weatherCity = "Brisbane,AU";
    byte forecastDays = 3;
    OpenWeatherMap.Units units = (isMetric)
        ? OpenWeatherMap.Units.METRIC
        : OpenWeatherMap.Units.IMPERIAL;
    OpenWeatherMap owm = new OpenWeatherMap(units, owmApiKey);
    try {
      DailyForecast forecast = owm.dailyForecastByCityName(weatherCity, forecastDays);
      System.out.println("Weather for: " + forecast.getCityInstance().getCityName());
      int numForecasts = forecast.getForecastCount();
      for (int i = 0; i < numForecasts; i++) {
        DailyForecast.Forecast dayForecast = forecast.getForecastInstance(i);
        DailyForecast.Forecast.Temperature temperature = dayForecast.getTemperatureInstance();
        System.out.println("\t" + dayForecast.getDateTime());
        System.out.println("\tTemperature: " + temperature.getMinimumTemperature() +
            " to " + temperature.getMaximumTemperature() + "\n");
      }
    }
    catch (IOException | JSONException e) {
      e.printStackTrace();
    }
  }
}
