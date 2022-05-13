package com.company;
/*Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
нет, возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 15*/
public class hw2_task10 {
    public static void main(String[] args){
        String str="let’s talk about java"; // our line
        char ch='l'; // we will try to find index of this letter from line end
        positionOfLastChar(str,ch,findLastCharIndex(str,ch)); // calling method with parameters and printing method
    }
    public static int findLastCharIndex(String str, char ch){
        int res=0; // this will be result
        for(int i=str.length()-1; i>=0; i--){ // loop, to take characters one by one from end to line start, step -1
            if(str.charAt(i)==ch){  // if character at position equal to our letter...
            res=i; // write this letter position to answer...
            break; // stop loop...
            }
        } return res; // return answer
    }
    public static void positionOfLastChar(String str, char ch, int res){
        System.out.println("последний индекс символа "+ ch + " в строке " + str + " равен "+res); // print answer

    }
}
