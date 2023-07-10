package week_14.abstraction.phone;

public abstract class Phone {
    String model;
    String color;

    public Phone(String model,String color){
        this.model=model;
        this.color=color;
    }

    abstract void text();  // first rule
    abstract void call(String name); // second rule
   //abstract void hasAndroid(); // we can not type because it is not common for all phones



}
