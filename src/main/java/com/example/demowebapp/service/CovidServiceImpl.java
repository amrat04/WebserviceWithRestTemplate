package com.example.demowebapp.service;

import com.example.demowebapp.dto.CoivdServiceList;
import com.example.demowebapp.dto.CovidServicesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class CovidServiceImpl implements CovidService {

    public static String X_RAPIDAPI_HOST = "x-rapidapi-host";

    public static String X_RAPIDAPI_KEY = "x-rapidapi-key";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<CovidServicesResponse> getCovidData() {


        HttpHeaders httpHeaders = setHeaders();

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        ResponseEntity<List<CovidServicesResponse>> response = null;
        try {

            response = restTemplate.exchange("https://covid-19-data.p.rapidapi.com/report/country/name?date-format=YYYY-MM-DD&format=json&date=2020-04-01&name=USA",
                    HttpMethod.GET, entity, new ParameterizedTypeReference<List<CovidServicesResponse>>() {});
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }


        return response.getBody();
    }

    private HttpHeaders setHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.add(X_RAPIDAPI_HOST, "covid-19-data.p.rapidapi.com");
        headers.add(X_RAPIDAPI_KEY,"10KbWG9IkwmshndbDF4tnjKzQ3pZp1BoIFqjsnvMfespt6EZpD");
        headers.add("useQueryString", String.valueOf(true));
        return  headers;
    }
}
