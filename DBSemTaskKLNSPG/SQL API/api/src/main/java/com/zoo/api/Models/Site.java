package com.zoo.api.Models;

import javax.persistence.*;

@Entity
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int site_id;

    @Column
    private String name;

    @Column
    private float area;

    @Column
    private String opening_hours;

    public int getSite_id() {
        return site_id;
    }
    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public String getOpening_hours() {
        return opening_hours;
    }
    public void setOpening_hours(String opening_hours) {
        this.opening_hours = opening_hours;
    }

    
}
