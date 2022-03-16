package com.CameronPugh.RestAPILOTR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:3000")
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
