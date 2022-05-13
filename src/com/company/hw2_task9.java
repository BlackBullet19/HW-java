package com.company;
/*Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 2*/
public class hw2_task9 {
    public static void main(String[] args) {
        String str = "let’s talk about java"; // our line
        char ch = 't'; // we will try to find index of this letter from line start
        positionOfChar(str, ch, findFirstCharIndex(str, ch)); // calling method with parameters and printing method
    }

    public static int findFirstCharIndex(String str, char ch) {
        int i=0; // this will be result
        for (i = 0; i < str.length(); i++) { // loop, to take characters one by one from start to line end, step 1+
            if(str.charAt(i) == ch) { // if character at position equal to our letter...
               break; // stop loop...
            }
        }
        return i; // and return answer
    }
    public static void positionOfChar (String str,char ch, int i){
        System.out.println("первый индекс символа " + ch + " в строке " + str + " равен " + i); // print answer

    }

}
