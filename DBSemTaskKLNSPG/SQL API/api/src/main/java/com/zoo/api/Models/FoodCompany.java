package com.zoo.api.Models;
import javax.persistence.*;

@Entity
public class FoodCompany {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comp_id;

    @Column
    private String company;

    @Column
    private int food_id;

    public int getComp_id() {
        return comp_id;
    }

    public void setComp_id(int comp_id) {
        this.comp_id = comp_id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }
}
