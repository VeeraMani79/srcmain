package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InterestRepository extends JpaRepository<Interest,Integer> {
 @Query(value="select interest_per from interest_info where interest_acno=:value",nativeQuery=true)
 public int getPer(@Param("value") int value);
}
