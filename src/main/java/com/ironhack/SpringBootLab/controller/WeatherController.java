package com.ironhack.SpringBootLab.controller;

import com.ironhack.SpringBootLab.model.Weather;
import com.ironhack.SpringBootLab.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weather")

public class WeatherController {

    private final WeatherService weatherService;

    //constructor (from right click on weatherService above) to connect with weatherService
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


     @GetMapping("/{temp}")
    public int tempOutside() {
        return weatherService.tempOutside();
    }

    //returns current weather condition
    @GetMapping("/{condi}")
    public String condiOutside() {
        return weatherService.condiOutside();
    }

    //returns current wind speed
    @GetMapping("/wind")
    public int windSpeedOutside() {
        return weatherService.windSpeedOutside();
    }


    @GetMapping("/weather")
    public String weatherOutside() {
        List<Weather> weatherList = weatherService.weatherOutside();
        Weather weather = weatherList.get(0);
        return "Temperature: " + weather.getTemp() + ", Condition: " + weather.getCondi() + ", Wind Speed: " + weather.getWind();
    }
}

