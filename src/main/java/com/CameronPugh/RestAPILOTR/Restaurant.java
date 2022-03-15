package com.CameronPugh.RestAPILOTR;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Restaurant {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private String name;
        private String location;
        private int max_capacity;

        @OneToMany
        private List<Dish> menu;

        @OneToMany
        private List<Staff> staff;

        public Restaurant(){}

        public Restaurant(String name, String location, int max_capacity, List<Staff> staff, List<Dish> menu) {
            this.name = name;
            this.location = location;
            this.max_capacity = max_capacity;
            this.menu = menu;
            this.staff = staff;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Restaurant{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", max_capacity=" + max_capacity +
                    ", menu=" + menu +
                    ", staff=" + staff +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Restaurant that = (Restaurant) o;
            return id == that.id && max_capacity == that.max_capacity && Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(menu, that.menu) && Objects.equals(staff, that.staff);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, location, max_capacity, menu, staff);
        }


        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public int getMax_capacity() {
            return max_capacity;
        }

        public List<Staff> getStaff() {
            return staff;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setMax_capacity(int max_capacity) {
            this.max_capacity = max_capacity;
        }

        public void setStaff(List<Staff> staff) {
            this.staff = staff;
        }

        public void setMenu(List<Dish> menu) {
            this.menu = menu;
        }

        public List<Dish> getMenu() {
            return menu;
        }
}
