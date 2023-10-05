package com.example.mapping.Controller;

import com.example.mapping.Model.Address;
import com.example.mapping.Model.Emp;
import com.example.mapping.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("upload/address")
    public String addAddress(@RequestBody List<Address> newAddress){
        return addressService.addAddress(newAddress);
    }

    @GetMapping("api/total/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("api/total/address/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PutMapping("change/by/{id}")
    public Address changeById(@PathVariable Long id, @RequestBody String city){
        return addressService.changeById(id,city);
    }

    @DeleteMapping("remove/by/id/{id}")
    public String removeById(@PathVariable Long id){
        return addressService.removeById(id);
    }
}
