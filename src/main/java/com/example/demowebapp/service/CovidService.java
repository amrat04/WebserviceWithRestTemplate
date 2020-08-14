package com.example.demowebapp.service;

import com.example.demowebapp.dto.CoivdServiceList;
import com.example.demowebapp.dto.CovidServicesResponse;

import java.util.List;

public interface CovidService {

    List<CovidServicesResponse> getCovidData();
}
