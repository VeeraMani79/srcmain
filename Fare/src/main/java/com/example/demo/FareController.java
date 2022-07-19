package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Repository
public class FareController {	
	@Autowired

	   FareRepository fareRepo;
		
				@GetMapping(value="/getId/{id}") //get  id 
					public Fare getId(@PathVariable int id) {
						return fareRepo.findById(id).get();
		 }
				@GetMapping(value="/getGST/{gst}")
				public int getGST(@PathVariable int gst) {
					return fareRepo.getGST(gst);
	}
}

