package com.company;
/*Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
в [] Например: “Hello” -> [H][e][l][l][o]*/
public class hw2_task13 {
    public static void main(String[] args) {
        String str = "Hello"; // defining line
        System.out.print(strWithBraces(str)); // calling method which use parameters line start line end...
        // and print it
    }

    public static String strWithBraces(String str){
        String strBraces=""; // defining empty string, it will be an answer
        for(int i=0; i<=str.length()-1;i++){ // loop, takes every letter from String
            char ch=str.charAt(i); // line now is spelled out to letters
            strBraces=strBraces+"[" + ch +"]"; // making new line adding to every letter [letter] braces
        }
        return strBraces; // return new line
    }
}

