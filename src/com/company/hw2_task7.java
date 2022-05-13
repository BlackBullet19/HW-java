package com.company;
/*Реализовать метод, который принимает 2 параметра int start и int finish и возвращает сумму
всех чисел от start до finish включительно.
Например: sum(10,15) -> 75*/
public class hw2_task7 {
    public static void main(String[] args){
        System.out.println(sumOfAllNumbers(10, 15));// calling for method with two numbers and print our answer
    }
    public static int sumOfAllNumbers(int start, int finish){
        int sum=0; // this will be answer, for now appoint it to 0
        for(int i=start; i<=finish; i++){ // making loop, where first number will be start(10) last number finish(15)
            // and step +1
            sum=sum+i; // with every step sum this to our answer
        }
        return sum; // when loop is finished give back answer
    }
}
