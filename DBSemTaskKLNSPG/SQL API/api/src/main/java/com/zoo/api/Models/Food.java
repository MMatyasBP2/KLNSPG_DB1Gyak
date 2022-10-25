package com.zoo.api.Models;
import javax.persistence.*;

@Entity
public class Food {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int food_id;

    @Column
    private String name;

    @Column
    private boolean is_delicious;

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_delicious() {
        return is_delicious;
    }

    public void setIs_delicious(boolean is_delicious) {
        this.is_delicious = is_delicious;
    }

    public boolean getIs_delicious()
    {
        return is_delicious;
    }
}
