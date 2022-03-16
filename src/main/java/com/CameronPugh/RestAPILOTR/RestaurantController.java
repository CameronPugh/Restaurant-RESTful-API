package com.CameronPugh.RestAPILOTR;


import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
class RestaurantController {

    private final RestaurantRepository repository;


    RestaurantController(RestaurantRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/restaurants")
    List<Restaurant> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/restaurants")
    Restaurant newRestaurant(@RequestBody Restaurant newRestaurant) {
        return repository.save(newRestaurant);
    }

    // Single item

    @GetMapping("/restaurants/{id}")
    Restaurant one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));
    }

    @PutMapping("/restaurants/{id}")
    Restaurant replaceEmployee(@RequestBody Restaurant newRestaurant, @PathVariable Long id) {

        return repository.findById(id)
                .map(restaurant -> {
                    restaurant.setName(newRestaurant.getName());
                    restaurant.setLocation(newRestaurant.getLocation());
                    restaurant.setStaff(newRestaurant.getStaff());
                    restaurant.setMenu(newRestaurant.getMenu());
                    return repository.save(restaurant);
                })
                .orElseGet(() -> {
                    newRestaurant.setId(id);
                    return repository.save(newRestaurant);
                });
    }

    @DeleteMapping("/restaurants/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
