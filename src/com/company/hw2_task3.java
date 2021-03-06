package com.company;
/*Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
должен возвращать true если и первое и второе число делятся без остатка на третье.
Подсказка: Используйте метод, написанный в пункте 2
*/
public class hw2_task3 {
    public static void main(String[] args) {
       int n1= 10; // appointing numbers
       int n2= 20;
       int n3= 1;
       showResult(n1,n2,n3,twoOfDivisibleByThird(n1,n2,n3)); // calling methods
    }
    public static boolean twoOfDivisibleByThird(int n1, int n2, int n3){
       return (n3!=0 && (n1%n3)==0 && (n2%n3)==0 ); // checking condition, n3 must not be 0 and remainder from n1/n3=0
        // remainder from n2/n3=0 and give back answer true or false

    }
    public static void showResult(int n1, int n2, int n3, boolean result){
        if(result){
            System.out.println(n1 +" и " + n2 + " делятся без остатка на " + n3); // true prints this
        } else {
            System.out.println(n1 +" и " + n2 + " не делятся без остатка на " + n3);// false prints this
        }
    }
}
