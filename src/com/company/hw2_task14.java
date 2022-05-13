package com.company;
/*Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”*/
public class hw2_task14 {
    public static void main(String[] args) {

        String str = "it's too much homework this time!!!"; // defining line
        System.out.println(substring(str, 0 ,22)); // range from where we will take letters for new line
    }

    public static String substring(String str, int start, int finish) {
        String result=""; // this will be an answer(String)
        for(int i=start; i<finish; i++){ // loop which one takes every letter one by one from our range from start to end, step +1
            char ch=str.charAt(i); // defining character from this place of variable i
            result=result+ch;// adding it to new String with every step +1 letter
        }
        return result; // return an answer
    }
}
