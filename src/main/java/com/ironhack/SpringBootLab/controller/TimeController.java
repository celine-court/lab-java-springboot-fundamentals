package com.ironhack.SpringBootLab.controller;

import com.ironhack.SpringBootLab.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class TimeController {
    private final com.ironhack.SpringBootLab.service.TimeService timeService;

    // Constructor injection for TimeService
    public TimeController(com.ironhack.SpringBootLab.service.TimeService timeService) {
        this.timeService = timeService;
    }

    // Endpoint to get current time
    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current time: " + timeService.getCurrentTime();
    }

    // Endpoint to get current date
    @GetMapping("/date")
    public String getCurrentDate() {
        return "Current date: " + timeService.getCurrentDate();
    }

    // Endpoint to get current day of the week
    @GetMapping("/day")
    public String getCurrentDay() {
        return "Today is: " + timeService.getCurrentDayOfWeek();
    }

    // Endpoint to get all time information
    @GetMapping("/all")
    public String getAllTimeInfo() {
        return timeService.getAllTimeInfo();
    }


}
