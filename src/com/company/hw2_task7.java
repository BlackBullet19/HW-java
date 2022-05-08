package com.company;
/*Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
всех чисел от start до finish включительно.
Например: sum(10,15) -> 75*/
public class hw2_task7 {
    public static void main(String[] args){
        System.out.println(sumOfAllNumbers(10, 15));
    }
    public static int sumOfAllNumbers(int start, int finish){
        int sum=0;
        for(int i=start; i<=finish; i++){
            sum=sum+i;
        }
        return sum;
    }
}
