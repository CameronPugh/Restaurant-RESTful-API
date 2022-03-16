package com.CameronPugh.RestAPILOTR;

import net.bytebuddy.implementation.bind.annotation.Origin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( consumes="application/json", produces = "application/json")

public interface DishRepository extends JpaRepository<Dish, Long> {

}