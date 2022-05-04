package com.company;

public class task2 {
    public static void main(String[] args){
        System.out.println(sumOfNumbers(30, 62));
    }
    public static int sumOfNumbers(int number1, int number2){
        int sum=0;
        for(int i=number1; i<=number2; i++){
            if(i%3==0){
                sum=sum+i;
            }
        }
        return sum;
    }

}