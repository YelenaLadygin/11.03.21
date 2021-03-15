package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString

public class Car implements Comparable<Car> {
    protected Integer id;
    protected String brand;
    protected String model;
    protected Date creation;
    protected String color;
    protected Integer seats;

    public Car(int id, String brand, String model, Date creation, String color, int seats) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.creation = creation;
        this.color = color;
        this.seats = seats;
    }
    @Override
    public int compareTo(Car o) {
        return this.id.compareTo(o.id);
    }
}


