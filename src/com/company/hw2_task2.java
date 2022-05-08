package com.company;
/*Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
true если number1 делится на number2 без остатка. Аналогично первой задаче
реализовать метод печати результата.*/
public class hw2_task2 {
    public static void main(String[] args) {
        printResult(10,4,isDivisible(10,4));
    }
    public static boolean isDivisible(int number1, int number2){
        boolean answer=(number1%number2)==0;
        return answer;
    }
    public static void printResult(int number1, int number2, boolean answer){
        if(answer){
            System.out.println(number1 + " делится на " + number2 + " без остатка.");
        } else {
            System.out.println(number1 + " не делится на " + number2 + " без остатка.");
        }
    }
}

