package com.company;
/*Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”*/
public class hw2_task14 {
    public static void main(String[] args) {

        String str = "it's too much homework this time!!!";
        System.out.println(substring(str, 0 ,22));
    }

    public static String substring(String str, int start, int finish) {
        String result="";
        for(int i=start; i<finish; i++){
            char ch=str.charAt(i);
            result=result+ch;
        }
        return result;
    }
}
