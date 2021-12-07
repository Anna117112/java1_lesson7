package com.geekbrains;

public class Cat {
    private String name;
    private int appetit;
    private boolean satiety;
    // Создалди конструктор

    public Cat (String name, int appetit){
        this.name = name;
        this.appetit = appetit;
        this.satiety = false;
    }
// Прередали в красс тарелка переменную аппетитт кота ,
    // чтобы отнять от количество еди оппетит
    public void eat (Plate p){
         {

            if (p.decreaseFood(appetit))
                satiety = true;
        }

    }
    // Вывели в консоль
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

