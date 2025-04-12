package com.ironhack.SpringBootLab.service;

import com.ironhack.SpringBootLab.model.Weather;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();
    private List<Weather> weatherList ;


    @PostConstruct
    public int tempOutside(){
        int temp = random.nextInt(51) - 10;
        return temp;
    }


    public String condiOutside(){
        String[] weatherCondi = {"Sunny", "Rainy", "Cloudy", "Windy"};
        String condi = weatherCondi[random.nextInt(weatherCondi.length)];
        return condi;
    }


    public int windSpeedOutside(){
        int wind = random.nextInt(101);
        return wind;
    }


    public List<Weather> weatherOutside() {
        Weather weather = new Weather(tempOutside(), condiOutside(), windSpeedOutside());
        return List.of(weather);
    }
}
