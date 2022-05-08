package com.company;
/*Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
должен возвращать true если и первое и второе число делятся без остатка на третье.
Подсказка: Используйте метод, написанный в пункте 2
*/
public class hw2_task3 {
    public static void main(String[] args) {
        twoOfDivisibleByThird(10, 20, 6);
    }
    public static void twoOfDivisibleByThird(int n1, int n2, int n3){
        if((n1%n3)==0 && (n2%n3)==0){
            System.out.println(n1 +" и " + n2 + " делятся без остатка на " + n3);
        } else {
            System.out.println(n1 +" и " + n2 + " не делятся без остатка на " + n3);
        }

    }
}
