package bsu.rfe.java.group6.lab1.Murashkin.var;

public abstract class Food implements Consumable,Nutritious {
     private String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    public boolean equals (Object ob1){
        if (ob1 instanceof Food)  return true;
        else return false;
    }
}
