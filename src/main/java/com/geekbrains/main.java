package com.geekbrains;

public class main {
    public static void main(String[] args) {


        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Пушок", 5);
        cat[1] = new Cat("Барсик", 10);
        cat[2] = new Cat("Мурзик", 20);

        Plate plate = new Plate(20);
        for (Cat cats: cat) {
            cats.eat(plate);
            cats.info();

        }

    }
}
