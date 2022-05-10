package com.company;
/*Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
нет, возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 15*/
public class hw2_task10 {
    public static void main(String[] args){
        String str="let’s talk about java";
        char ch='t';
        positionOfLastChar(str,ch,findLastCharIndex(str,ch));
    }
    public static int findLastCharIndex(String str, char ch){
        int charPosition=str.lastIndexOf(ch);
        return charPosition;
    }
    public static void positionOfLastChar(String str, char ch, int charPosition){
        System.out.println("последний индекс символа "+ ch + " в строке " + str + " равен "+charPosition);

    }
}
