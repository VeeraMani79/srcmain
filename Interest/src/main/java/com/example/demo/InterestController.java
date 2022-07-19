package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository

public class InterestController {
@Autowired

    InterestRepository interestRepo;
@GetMapping(value="/getId/{id}")
public Interest getId(@PathVariable int id) {
	return interestRepo.findById(id).get();
}
@GetMapping(value="/getAcno/{value}")
public int getPer(@PathVariable int value) {
	return interestRepo.getPer(value);
}
}
