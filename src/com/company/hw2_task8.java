package com.company;
/*Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
Число 13 не входит. )*/
public class hw2_task8 {
    public static void main(String[] args) {
        int start=10; // appoint numbers
        int finish=15;
        int digit=3;
        System.out.println(sumWithoutDigitNum(start,finish,digitCheck(digit))); // calling to methods with given numbers
    }
    public static int digitCheck(int digit){
        if(digit<0 || digit>=9){ // this method checks if variable digit is in range from 0 and 9 inclusive
            digit=0; // if not in a range, replace it with 0
        } return digit;
    }
     public static int sumWithoutDigitNum(int start, int finish, int digit){
        int sum=0;  // this will be answer, for now appoint it to 0
        for(int i=start;i<=finish;i++){ // making loop, where first number will be start(10) last number finish(15)
            // and step +1
            if((i-digit)%10!=0){ // condition check, if number isn't ending with our digit then sum it to answer
                // this condition checks if our number is not divisible with 10, (13(i)-3(digit)) / 10 = 1 remainder 0
                // so this one passes not
                sum=sum+i;
            }
        }return sum;
    }
}
