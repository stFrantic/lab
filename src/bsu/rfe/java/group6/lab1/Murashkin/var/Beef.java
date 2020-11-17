package bsu.rfe.java.group6.lab1.Murashkin.var;

public class Beef extends Food   {
    String type;
    public Beef(String type) throws Exception
    {
      super("Мясо");
      this.type = type;
      if (type.equals("с кровью")){return;}
      else if(type.equals("норма")) { return;}
      else if (type.equals("прожаренное")){return;}
      else throw new Exception("Такого типа не существует");
    }
    public String getType() {
        return type;
    }
    @Override
    public void consume() {
        System.out.println(this + "cъедено");
    }

    @Override
    public double calculateCalories() {
        if (this.type == "с кровью"){ return 1000.0;}
        else if(this.type == "норма") { return 1500.0;}
        else if (this.type == "прожаренное"){return 2000.0;}else return 0;
    }
    @Override
    public boolean equals (Object ob1)
    {
        if(super.equals(ob1)) {
            if (!(ob1 instanceof Beef))  return false;
            return type.equals(((Beef) ob1).type);
        }else return false;
    }
}
