package com.example.demowebapp.dto;

import java.util.List;

public class CovidServicesResponse {

    private String country;

    private double latitude;

    private double longitude;

    private String date;

    private List<Provinces> provinces;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Provinces> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Provinces> provinces) {
        this.provinces = provinces;
    }
}
