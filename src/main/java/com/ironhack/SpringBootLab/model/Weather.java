package com.ironhack.SpringBootLab.model;

public class Weather {
    public int temp;
    public String condi;
    public int wind;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getCondi() {
        return condi;
    }

    public void setCondi(String condi) {
        this.condi = condi;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public Weather(int temp, String condi, int wind) {
        this.temp = temp;
        this.condi = condi;
        this.wind = wind;
    }
}
