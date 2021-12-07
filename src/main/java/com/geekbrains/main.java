package com.geekbrains;

public class main {
    public static void main(String[] args) {

// Создали массив котов
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Пушок", 5);
        cat[1] = new Cat("Барсик", 10);
        cat[2] = new Cat("Мурзик", 20);
// Попросили покушатьс одной тарелки
        Plate plate = new Plate(20);
        // Прошлись циклом по массиву
        for (Cat cats: cat) {
         //   Кот поел
            cats.eat(plate);
            // Вывели инфо в консоль
            cats.info();

        }

    }
}
