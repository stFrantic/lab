package bsu.rfe.java.group6.lab1.Murashkin.var;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws Exception {
        Food[] menu = new Food[20];
        int alredyIn = 0;
        boolean isSort = false;
        boolean isCalories = false;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Мясо")) {
                menu[alredyIn] = new Beef(parts[1]);
                alredyIn++;
            } else if (parts[0].equals("Яблоко")) {
                menu[alredyIn] = new Apple(parts[1]);
                alredyIn++;
            } else if (parts[0].equals("Сыр")) {
                menu[alredyIn] = new Cheese();
                alredyIn++;
            } else if (parts[0].equals("-sort")) {
                isSort = true;
            } else if (parts[0].equals("-calories")) {
                isCalories = true;
            } else break;

        }
        if (isSort) {
            Arrays.sort(menu, new FoodComparator());
            System.out.println("Завтрак:");
            for (Food item : menu) {
                if (item != null) {
                    item.consume();
                } else break;
            }
        }
        System.out.println("Всего в завтраке");
        int[] amount = new int[7];
        for (Food item : menu) {
            if (item.getName().equals("Сыр")) {
                amount[0]++;
            }
            if (item.getName().equals("Яблоко")) {
                Apple a = (Apple) item;
                if (a.getSize().equals("большое")) {
                    amount[1]++;
                }else if(a.getSize().equals("среднее")) amount[6]++;
                else amount[2]++;
            }
            if (item.getName().equals("Мясо")) {
                Beef a = (Beef) item;
                if (a.getType().equals("с кровью")) amount[3]++;
                else if (a.getType().equals("норма")) amount[4]++;
                else amount[5]++;
            }
            if (amount[0] != 0) System.out.println("Всего сыра: " + amount[0]);
            if (amount[1] != 0) System.out.println("Всего больших яблок: " + amount[1]);
            if (amount[6] != 0) System.out.println("Всего средних яблок: " + amount[6]);
            if (amount[2] != 0) System.out.println("Всего маленьких яблок: " + amount[2]);
            if (amount[3] != 0) System.out.println("Всего мяса с кровью: " + amount[3]);
            if (amount[4] != 0) System.out.println("Всего мяса нормальной прожарки: " + amount[4]);
            if (amount[5] != 0) System.out.println("Всего прожаренного мяса: " + amount[5]);
            if (isCalories) {
                double calories = 0;
                for (Food m : menu) {
                    if (m != null) {
                        calories += m.calculateCalories();
                    }
                }
                System.out.println("Общая каллорийная ценность = " + calories);
            }
        }
    }
}
