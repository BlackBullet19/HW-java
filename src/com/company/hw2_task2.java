package com.company;
/*Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
true если number1 делится на number2 без остатка. Аналогично первой задаче
реализовать метод печати результата.*/
public class hw2_task2 {
    public static void main(String[] args) {
        int number1=10; // appointing two numbers
        int number2=0;
        printResult(number1,number2 ,isDivisible(number1,number2)); // calling methods with numbers
    }
    public static boolean isDivisible(int number1, int number2) {
       return (number2!=0 && number1%number2==0); // give back true when number2 is not 0 and if number1 division with number2
        // remainder is equal to 0
    }
    public static void printResult(int number1, int number2, boolean answer){
        if(answer){
            System.out.println(number1 + " делится на " + number2 + " без остатка."); // when previous method says true print this
        } else {
            System.out.println(number1 + " не делится на " + number2 + " без остатка."); // when false, then this
        }
    }
}

