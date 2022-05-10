package com.company;
/*Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 2*/
public class hw2_task9 {
    public static void main(String[] args){
        String str="let’s talk about java";
        char ch='t';
        positionOfChar(str,ch,findFirstCharIndex(str,ch));
    }
    public static int findFirstCharIndex(String str, char ch){
        int charPosition=str.indexOf(ch);
        return charPosition;
    }
    public static void positionOfChar(String str, char ch, int charPosition){
        System.out.println("первый индекс символа "+ ch + " в строке " + str + " равен "+charPosition);

    }
}
