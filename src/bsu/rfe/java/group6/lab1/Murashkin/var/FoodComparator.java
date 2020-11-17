package bsu.rfe.java.group6.lab1.Murashkin.var;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {
    @Override
    public int compare(Food o1, Food o2) {
            if(o1 == null ){return 1;}
            if (o2 == null){return -1;}
            return o1.getName().compareTo(o2.getName());
        }
    }

