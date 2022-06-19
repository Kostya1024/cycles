package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService numberOfSquares = new SQRService();

        double rangeStart = 200;
        double rangeEnd = 300;

        int numberCounter = numberOfSquares.squares(rangeStart, rangeEnd);
        System.out.println(numberCounter);


    }
}
