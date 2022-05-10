package com.company;
/*Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк:
Подсказка: Используйте метод, написанный в пункте 4
Например: longestString (“java”,”welcome”,”hello”) -> “welcome”*/
public class hw2_task5 {
    public static void main(String[] args) {
        String a="welcome to the jungle";
        String b="highway to hell";
        String c="we are the champions";
        answer(longestString(a, b, c));
    }

    public static String longestString(String a, String b, String c) {
        String longest="";
        if((a.length()>=b.length() && a.length()>=c.length())){
            return longest=a;
        } else if(b.length()>=a.length() && b.length()>=c.length()){
            return longest=b;
        } else {
            return longest=c;
        }
    }

    public static void answer(String longest){
        System.out.println("самая длинная строка из трех заданных строк '"+longest +"'");
    }
}
