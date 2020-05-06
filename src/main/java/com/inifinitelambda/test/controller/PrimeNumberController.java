package com.inifinitelambda.test.controller;

import com.inifinitelambda.test.service.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: yanislav_ivanov
 * Date: 05/05/2020
 */
@RestController
@RequestMapping(value = "/primeNumber", produces = MediaType.APPLICATION_JSON_VALUE)
public class PrimeNumberController {

    @Autowired
    private PrimeNumberService service;

    @GetMapping(value = "/test/{number}")
    public ResponseEntity<Boolean> isPrimeNumber(@PathVariable Long number) {
        if (number == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(service.isPrimeNumber(number));
    }

    @GetMapping(value = "/nextPrime/{number}")
    public ResponseEntity<Long> nextPrimeNumber(@PathVariable Long number) {
        if (number == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(service.nextPrime(number));
    }
}
