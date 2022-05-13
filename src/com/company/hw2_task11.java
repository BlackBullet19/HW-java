package com.company;
/*Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
символов начиная с начала одинаковые у обеих строк.*/
public class hw2_task11 {
    public static void main(String[] args){
        String java1="java is not easy!"; // defining lines
        String java2="java is not easy!!!";
        printAnswer(stringSameCharCount(java1, java2), java1, java2); // calling methods, printing and checking
    }
    public static int stringSameCharCount(String java1, String java2){
        int i=0; // we need to know which line is longer, this will be an answer
        if(java1.length()>java2.length()){ // checking if first line is longer than second
             i =java2.length(); // yes it is
        } else {
             i=java1.length(); // no, second is longer
        }
        int result=0; // this will be an answer, how many letters are same in both lines from start
        for (int j=0; j<i; j++){ // start loop from first letter, stop it when short line is finished, step 1+
            if(java1.charAt(j)==java2.charAt(j)){ // condition, if character is same in both lines...
                result=result+1; // +1 to result with every step...
            } else {
                break; // when letters are different stop loop...
            }
        }
        return result; // and give answer
    }
    public static void printAnswer(int result, String java1, String java2){
        System.out.println("количество одинаковых с начало символов строчках   " + java1 + "   и   " + java2+ "    равно " + result);
    } // print answer
    }
