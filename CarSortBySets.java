package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CarSortBySets implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.seats.compareTo(o2.seats);
    }

}
