package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add (new Car(959,"volvo","S40",new Date(),"blue",3 ));
        cars.add (new Car(111,"hyndai","I25",new Date(),"grey",4 ));
        cars.add (new Car(123,"audi","I80",new Date(),"white",5 ));
        cars.add (new Car(446,"mazda","mazda3",new Date(),"red",4 ));

        Collections.sort( cars, new CarSortByColor());

        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }

        Collections.sort( cars, new CarSortByBrandAndModel());

        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }
        Collections.sort( cars, new CarSortBySets());

        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }



    }
    }











