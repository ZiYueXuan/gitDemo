package com.test;

public class Car {
    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public void show() {
        System.out.println(this.id+"-----"+this.name);
    }
}
