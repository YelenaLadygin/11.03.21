package com.company;

import java.util.Comparator;

public class CarSortByBrandAndModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int a= o1.brand.compareTo(o2.brand);
        //return a;
        if (a==0) {
            int b= o1.model.compareTo(o2.model);
            return b;
        } else return a;
        }
        }

