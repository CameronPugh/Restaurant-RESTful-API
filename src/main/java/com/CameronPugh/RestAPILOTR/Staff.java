package com.CameronPugh.RestAPILOTR;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String first_name;
    private String last_name;
    private String job_role;
    private double hourly_rate;


    public Staff() {
    }

    public Staff(String first_name, String last_name, String job_role, double hourly_rate) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.job_role = job_role;
        this.hourly_rate = hourly_rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id == staff.id && hourly_rate == staff.hourly_rate && Objects.equals(first_name, staff.first_name) && Objects.equals(last_name, staff.last_name) && Objects.equals(job_role, staff.job_role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, job_role, hourly_rate);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", job_role='" + job_role + '\'' +
                ", hourly_rate=" + hourly_rate +
                '}';
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getJob_role() {
        return job_role;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public void setJob_role(String job_role) {
        this.job_role = job_role;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
