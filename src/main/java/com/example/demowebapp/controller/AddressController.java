package com.example.demowebapp.controller;

import com.example.demowebapp.dto.LoginRequest;
import com.example.demowebapp.entity.Address;
import com.example.demowebapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/saveaddress")
    @ResponseBody
    public boolean saveAddress(@RequestBody Address address){

        boolean isSaved = addressService.saveAddress(address);
        return isSaved;
    }

}
