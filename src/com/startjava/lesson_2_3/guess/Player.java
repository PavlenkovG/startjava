package com.startjava.src.com.startjava.lesson_2_3.guess;

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        if (number < 0 || number > 100) {
            System.out.println("Некорректное число\n");
        } else {
            this.number = number;
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}