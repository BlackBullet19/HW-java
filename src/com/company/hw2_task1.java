package com.company;
/*Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
“15 это не четное число»
Подсказка: Используем конструкцию if и оператор % modulo*/
public class hw2_task1 {
    public static void main(String[] args) {
        int a=21;
        printCheckResultMessage(a,isEven(a));
    }
    public static boolean isEven(int number){
        boolean result = (number %2)==0;
        return result;
    }


    static void printCheckResultMessage(int number, boolean result){
        if(result){
            System.out.println(number +" это четное число");
        } else {
            System.out.println(number +" это не четное число");
        }
    }



}

