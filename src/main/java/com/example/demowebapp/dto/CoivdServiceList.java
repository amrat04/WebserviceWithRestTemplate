package com.example.demowebapp.dto;

import java.util.List;

public class CoivdServiceList {

    List<CovidServicesResponse> response;

    public List<CovidServicesResponse> getResponse() {
        return response;
    }

    public void setResponse(List<CovidServicesResponse> response) {
        this.response = response;
    }
}
