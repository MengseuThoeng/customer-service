package com.acledabank.customerservice.controller;

import com.acledabank.customerservice.dto.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @GetMapping("/public")
    CustomerResponse getCustomersPublic(@RequestParam(defaultValue = "1") String customerId){
        return CustomerResponse.builder()
                .customerId(customerId)
                .firstName("John")
                .lastName("Doe")
                .kyc("ACCEPTED")
                .build();
    }

    @GetMapping("/private")
    CustomerResponse getCustomersPrivate(@RequestParam(defaultValue = "1") String customerId){
        return CustomerResponse.builder()
                .customerId(customerId)
                .firstName("Mengseu")
                .lastName("Thoeng")
                .kyc("REJECTED")
                .build();
    }

    @GetMapping("/vault")
    Map<String, String> getValueVault(){
        return Map.of(username, password);
    }

    @Value("${CONFIG_PW.USERNAME}")
    private String username;

    @Value("${CONFIG_PW.PASSWORD}")
    private String password;

}
