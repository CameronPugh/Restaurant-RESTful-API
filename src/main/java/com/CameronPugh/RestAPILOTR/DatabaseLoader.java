package com.CameronPugh.RestAPILOTR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;
    private final StaffRepository staffRepository;
    private final DishRepository dishRepository;

    @Autowired
    public DatabaseLoader(RestaurantRepository restaurantRepository, StaffRepository staffRepository, DishRepository dishRepository) {
        this.restaurantRepository = restaurantRepository;
        this.staffRepository = staffRepository;
        this.dishRepository = dishRepository;
    }

    @Override
    public void run(String... strings) throws Exception
    {
        Dish pizza = new Dish("pizza", 10.50);
        Dish fries = new Dish("fries", 5.50);
        Dish bread = new Dish("bread", 1.50);
        ArrayList<Dish> menu = new ArrayList<>();
        menu.add(pizza);
        menu.add(fries);
        menu.add(bread);
        this.dishRepository.saveAll(menu);

        Staff fred = new Staff("Fred", "Dibnah", "Chef", 8.50);
        Staff max = new Staff("Max", "Paddy", "Waitor", 6.50);
        ArrayList<Staff> staff = new ArrayList<>();
        staff.add(fred);
        staff.add(max);
        this.staffRepository.saveAll(staff);

        this.restaurantRepository.save(new Restaurant("Fancy Food","Paris",20,staff,menu));
    }
}
