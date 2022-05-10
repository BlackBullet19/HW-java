package com.company;
/*Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
в [] Например: “Hello” -> [H][e][l][l][o]*/
public class hw2_task13 {
    public static void main(String[] args) {
        String str = "Hello";
        int a=str.length()-1;

        System.out.print(strWithBraces(str, 0,a));
    }

    public static String strWithBraces(String str, int start, int a){
        String strBraces="";
        for(int i=start; i<=a;i++){
            char ch=str.charAt(i);
            strBraces=strBraces+"[" + ch +"]";
        }
        return strBraces;

    }
}

