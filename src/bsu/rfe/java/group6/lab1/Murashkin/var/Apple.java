package bsu.rfe.java.group6.lab1.Murashkin.var;

public class Apple extends Food {
    private String size;

    public Apple(String size) throws Exception {
        super("Яблоко");
        this.size = size;
        if(size == "большое") { return;
        }else if (size == "среднее") {
            return;
        }else if(size == "маленькое") {
            return;
        } else
        {
            throw new Exception("Такого размера не существует");
        }
    }


    @Override
    public void consume() {
        System.out.println(this + "съедено");
    }

    @Override
    public double calculateCalories()  {
        if(size == "большое") { return 100;
            }else if (size == "среднее") {
            return 50;
                }else if(size == "маленькое") {
            return 10;
        } else return 0;
    }

    public String getParam() {
        return size;
    }

    public void setParam(String param) {
        this.size = param;
    }
}
