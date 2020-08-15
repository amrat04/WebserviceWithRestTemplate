package com.example.demowebapp.service;

import com.example.demowebapp.entity.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService3rdpartyImpl  implements AddressService{

    @Override
    public boolean saveAddress(Address address) {
        return false;
    }
}
