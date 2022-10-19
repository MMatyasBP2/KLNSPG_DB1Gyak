package com.zoo.api.Models;
import javax.persistence.*;

@Entity
public class Habitat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int habitat_id;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private String description;

    @Column
    private int capacity;

    @Column
    private int site_id;

    public int getHabitat_id() {
        return habitat_id;
    }

    public void setHabitat_id(int habitat_id) {
        this.habitat_id = habitat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSite_id() {
        return site_id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    
}
