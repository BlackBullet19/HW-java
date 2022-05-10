package com.company;
/*Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
наибольшее из трех переданных чисел:
Например: max3(10,19,0) -> 19*/
public class hw2_task4 {
    public static void main(String[] args) {
        System.out.println("наибольшее из трех переданных чисел " +max3(10000,5000,60));
    }
    public static int max3(int a, int b, int c) {
    int biggest =0;
        if((a>=b && a>=c)){
        return biggest=a;

    } else if(b>=a && b>=c){
        return biggest=b;

    } else {
            return biggest=c;

    }


    }
}

