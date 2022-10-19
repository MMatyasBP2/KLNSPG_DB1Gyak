package com.zoo.api.Models;
import javax.persistence.*;

@Entity
public class Eat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animal_id;

    @Column
    private int food_id;

    @Column
    private String feeding_time;

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getFeeding_time() {
        return feeding_time;
    }

    public void setFeeding_time(String feeding_time) {
        this.feeding_time = feeding_time;
    }

    
}
