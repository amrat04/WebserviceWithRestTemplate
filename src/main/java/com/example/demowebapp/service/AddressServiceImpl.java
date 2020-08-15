package com.example.demowebapp.service;

import com.example.demowebapp.entity.Address;
import com.example.demowebapp.jpa.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public boolean saveAddress(Address address) {
        addressRepository.save(address);
        return true;
    }
}
