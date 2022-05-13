package com.company;
/*Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
“15 это не четное число»
Подсказка: Используем конструкцию if и оператор % modulo*/
public class hw2_task1 {
    public static void main(String[] args) {
        int a=21; // it's our number we want to check is it even or not
        printCheckResultMessage(a,isEven(a)); // calling for checking method and result printing method
    }
    public static boolean isEven(int number){
        boolean result = (number %2)==0; // if remainder from division with 2 is equal to 0 than it's even number
        return result; // and it gives answer true=even, false=odd.
    }

    static void printCheckResultMessage(int number, boolean result){
        if(result){
            System.out.println(number +" это четное число");// if true=even print this
        } else {
            System.out.println(number +" это не четное число");//if false=odd print this
        }
    }
}

