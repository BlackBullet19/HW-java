package com.company;
/*Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
в [] Например: “Hello” -> [H][e][l][l][o]*/
public class hw2_task13 {
    public static void main(String[] args) {
        String str = "Hello"; // defining line
        int a=str.length()-1; // line length

        System.out.print(strWithBraces(str, 0,a)); // calling method which use parameters line start line end...
        // and print it
    }

    public static String strWithBraces(String str, int start, int a){
        String strBraces=""; // defining empty string, it will be an answer
        for(int i=start; i<=a;i++){ // loop, takes every letter from String
            char ch=str.charAt(i); // line now is spelled out to letters
            strBraces=strBraces+"[" + ch +"]"; // making new line adding to every letter [letter] braces
        }
        return strBraces; // return new line

    }
}

