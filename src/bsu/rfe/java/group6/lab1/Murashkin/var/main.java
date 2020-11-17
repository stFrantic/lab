package bsu.rfe.java.group6.lab1.Murashkin.var;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Food[] menu = new Food[20];
        int alredyIn = 0;
        for(String arg : args)
        {
            String[] parts = arg.split("/");
            if (parts[0].equals("Мясо")){
              menu[alredyIn] = new Beef(parts[1]);
            }else if(parts[0].equals("Яблоко")) {
                menu[alredyIn] = new Apple(parts[1]);
                }else if(parts[0].equals("Сыр")) {
                    menu[alredyIn] = new Cheese();
                }else if (parts[0].equals("-sort")) {
                Arrays.sort(menu, new FoodComparator());
                System.out.println("Завтрак:");
                for (Food item : menu) {
                    if (item != null) {
                        System.out.println(item.toString()); } else { break; }
                }
            }else if (parts[0].equals("-calories"))
            { int calories = 0;
             for (Food m : menu)
             {
                 calories+=m.calculateCalories();
             }
                System.out.println("Общая каллорийная ценность = " + calories);
            }
            alredyIn++;
        }
    }
}
