package ru.netology.maven;

public class Main {
    public static void main(String[] args) {
        restCalc service = new restCalc();
        int income = 100000;
        int expense = 60000;
        int thresold = 150000;
        int dayOfRest = service.restMonth(income, expense, thresold);
        System.out.println(dayOfRest);
    }
}