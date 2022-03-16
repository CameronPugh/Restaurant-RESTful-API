package com.CameronPugh.RestAPILOTR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

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
        Dish pie = new Dish("pie", 10.50);
        Dish fish = new Dish("fish", 5.50);
        Dish grapes = new Dish("grapes", 1.50);
        Dish meat = new Dish("meat", 10.50);
        Dish burger = new Dish("burger", 5.50);
        Dish cereal = new Dish("cereal", 1.50);
        ArrayList<Dish> menu = new ArrayList<>();
        menu.add(fish);
        menu.add(meat);
        menu.add(burger);
        menu.add(cereal);
        menu.add(grapes);
        this.dishRepository.saveAll(menu);

        Staff fred = new Staff("Fred", "Dibnah", "Chef", 8.50);
        Staff max = new Staff("Max", "Paddy", "Waitor", 6.50);
        Staff sam = new Staff("Sam", "Potts", "Chef", 8.50);
        Staff dave = new Staff("Dave", "Sak", "Chef", 6.50);
        Staff Bill = new Staff("Bill", "Pols", "Chef", 8.50);
        Staff Jeff = new Staff("Jeff", "Paddy", "Waitor", 6.50);
        ArrayList<Staff> staff = new ArrayList<>();
        staff.add(fred);
        staff.add(max);
        staff.add(dave);
        this.staffRepository.saveAll(staff);

        ArrayList<Staff> staff2 = new ArrayList<>();
        staff2.add(sam);
        staff2.add(Jeff);
        staff2.add(Bill);

        this.staffRepository.saveAll(staff2);

        ArrayList<Dish> menu2 = new ArrayList<>();
        menu2.add(pizza);
        menu2.add(fries);
        menu2.add(bread);
        menu2.add(pie);

        this.dishRepository.saveAll(menu2);


        this.restaurantRepository.save(new Restaurant("Fancy Food","Paris",20,staff,menu));
        this.restaurantRepository.save(new Restaurant("Best Food","London",50,staff2,menu2));
    }
}
