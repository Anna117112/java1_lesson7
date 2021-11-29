package com.geekbrains;

import java.util.InputMismatchException;

public class Plate {
    private int food ;

    public Plate(int food){
        this.food = food;
    }


    public boolean decreaseFood(int appetit){

        if (appetit>food) {
            return false;
           // throw new InputMismatchException("В тарелке мало еды. Кот не может покушать ");
        }
        else
        food -=appetit;
         if (food>=0)
        return true;
        else
            throw new InputMismatchException("В тарелке не может быть отрицательное значение ");

    }



    public void increaseFood() {
        this.food += food;
        System.out.println("В миску добавили " + food +" еды");
    }

    public void info () {

            System.out.println("В тарелке " + food + " еды");

    }

    public int getFood() {
        return food;

    }

    public void setFood(int food) {

        this.food = food;
    }
}
