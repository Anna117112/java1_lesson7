package com.geekbrains;

public class Cat {
    private String name;
    private int appetit;
    private boolean satiety;

    public Cat (String name, int appetit){
        this.name = name;
        this.appetit = appetit;
        this.satiety = false;
    }

    public void eat (Plate p){
         {

            if (p.decreaseFood(appetit))
                satiety = true;
        }

    }
    public void info(){
        if (satiety)
            System.out.println(name + " наелся ");
        else
            System.out.println(name + " голоден");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }


    }

