package com.company;
/*Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
делятся на 4*/
public class hw2_task6 {
    public static void main(String[] args) {
        numbersNotDivisibleByFour(0, 100); // calling for method with two numbers
    }

    public static void numbersNotDivisibleByFour(int start, int finish) {
        for(int i=start; i<finish; i++) { // make a loop in range first number(0) to last (100) step will be +1
        if((i % 4)!=0) { // making condition, if number in given range isn't divisible with 4
                System.out.println(i);// print number which met condition
            }
        }
    }
}

