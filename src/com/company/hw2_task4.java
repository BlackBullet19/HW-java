package com.company;
/*Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
наибольшее из трех переданных чисел:
Например: max3(10,19,0) -> 19*/
public class hw2_task4 {
    public static void main(String[] args) {
        max3(100,5,363);
    }
    public static int max3(int a, int b, int c) {
    if((a>=b && a>=c)){
        System.out.println(a+" наибольшее из трех переданных чисел");
    } else if(b>=a && b>=c){
        System.out.println(b+" наибольшее из трех переданных чисел");
    } else {
        System.out.println(c+" наибольшее из трех переданных чисел");
    }

        return a;
    }
}

