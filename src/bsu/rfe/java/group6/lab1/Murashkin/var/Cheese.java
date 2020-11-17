package bsu.rfe.java.group6.lab1.Murashkin.var;

public class Cheese extends Food {
        public Cheese() {
            super("Сыр");
        }
        public void consume() {
            System.out.println(this + " съеден");
        }

    @Override
    public double calculateCalories() {
        return 200.0;
    }
}
