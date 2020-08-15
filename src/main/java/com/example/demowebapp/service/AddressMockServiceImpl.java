package com.example.demowebapp.service;

import com.example.demowebapp.entity.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressMockServiceImpl  implements  AddressService{
    @Override
    public boolean saveAddress(Address address) {
        // This is just mock implementation
        return true;
    }
}
