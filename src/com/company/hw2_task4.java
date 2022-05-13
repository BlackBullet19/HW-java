package com.company;
/*Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
наибольшее из трех переданных чисел:
Например: max3(10,19,0) -> 19*/
public class hw2_task4 {
    public static void main(String[] args) {
        System.out.println("наибольшее из трех переданных чисел " +max3(10000,5000,60)); // calling method with gaven numbers
        // and also print result
    }
    public static int max3(int a, int b, int c) {
    int biggest =0; // biggest of three numbers will take this place, for now let it be 0
        if((a>=b && a>=c)){ // checking condition if number 'a' is the biggest
        return biggest=a; // when it is, then put 'a' to place of biggest and return this as answer

    } else if(b>=a && b>=c){ // same here just with number 'b'
        return biggest=b;

    } else {
            return biggest=c; // when to other numbers aren't  meeting conditions, make biggest 'c'

    }


    }
}

