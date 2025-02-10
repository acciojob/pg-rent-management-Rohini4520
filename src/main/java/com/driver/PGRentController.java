package com.driver;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pg")
public class PGRentController {

    private final Map<Integer, PGDetails> pgStore = new HashMap<>();
    private static int pgIDCounter = 1;

    @PostMapping("/register")
    public ResponseEntity<String> registerPG(@RequestBody PGDetailsRequest pgDetailsRequest) {
    	// your code goes here
        return null;
    }

    @PutMapping("/updateRent/{id}")
    public ResponseEntity<String> updateRent(@PathVariable int id, @RequestBody RentUpdateRequest rentUpdateRequest) {
    	// your code goes here
        return null;
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<PGDetails> fetchDetails(@PathVariable int id) {
    	// your code goes here
    	return null;
    }

    @GetMapping("/annualIncome/{id}")
    public ResponseEntity<Double> annualIncome(@PathVariable int id) {
    	// your code goes here
    	return null;
    }

    @ExceptionHandler(PGNotFoundException.class)
    public ResponseEntity<String> handleException(PGNotFoundException e) {
    	// your code goes here
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
