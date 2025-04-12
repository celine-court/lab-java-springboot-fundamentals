package com.ironhack.SpringBootLab.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    public String getCurrentTime() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalDateTime.now().format(timeFormatter);
    }

    // Get the current date
    public String getCurrentDate() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(dateFormatter);
    }

    // Get the current day of the week
    public String getCurrentDayOfWeek() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return dayOfWeek.name(); // Returns "MONDAY", "TUESDAY", etc.
    }

    // Method to get all time information
    public String getAllTimeInfo() {
        return "Date: " + getCurrentDate() + ", Time: " + getCurrentTime() + ", Day: " + getCurrentDayOfWeek();
    }

}
