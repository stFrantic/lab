package bsu.rfe.java.group6.lab1.Murashkin.var;

public class Apple extends Food {
    private String size;

    public Apple(String size) throws Exception {
        super("Яблоко");
        this.size = size;
        if (size.equals("большое")) {
            return;
        } else if (size.equals("среднее")) {
            return;
        } else if (size.equals("маленькое")) {
            return;
        } else {
            throw new Exception("Такого размера не существует");
        }
    }

    public String getSize() {
        return size;
    }

    @Override
    public void consume() {
        System.out.println(this + "съедено");
    }

    @Override
    public double calculateCalories() {
        if (size.equals("большое")) {
            return 100;
        } else if (size.equals("среднее")) {
            return 50;
        } else if (size.equals("маленькое")) {
            return 10;
        } else return 0;
    }
    @Override
    public boolean equals (Object ob1)
    {
        if(super.equals(ob1)) {
            if (!(ob1 instanceof Beef))  return false;
            return size.equals(((Apple) ob1).size);
        }else return false;
    }
}
