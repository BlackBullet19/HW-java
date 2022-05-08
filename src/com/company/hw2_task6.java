package com.company;
/*Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
делятся на 4*/
public class hw2_task6 {
    public static void main(String[] args) {
        numbersNotDivisibleByFour(0, 100);
    }

    public static void numbersNotDivisibleByFour(int start, int finish) {
        for(int i=start; i<=finish; i++) {
        if((i % 4)!=0) {
                System.out.println(i);
            }
        }
    }
}

