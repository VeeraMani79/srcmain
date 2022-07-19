package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FareRepository extends JpaRepository<Fare,Integer> {
	@Query(value="select covenience_GST from covenience_fees where otpno =:gst",nativeQuery=true)
	 public int getGST(@Param("gst") int gst);
}
