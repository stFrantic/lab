package bsu.rfe.java.group6.lab1.Murashkin.var;

public abstract class Food implements Consumable,Nutritious {
     private String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
