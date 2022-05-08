package com.company;
/*Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк:
Подсказка: Используйте метод, написанный в пункте 4
Например: longestString (“java”,”welcome”,”hello”) -> “welcome”*/
public class hw2_task5 {
    public static void main(String[] args) {
        longest("welcome","java", "hello");
    }
    public static String longest(String a, String b, String c) {
        if((a.length()>=b.length() && a.length()>=c.length())){
            System.out.println(a+" самая длинная строка из трех заданных строк");
        } else if(b.length()>=a.length() && b.length()>=c.length()){
            System.out.println(b+" самая длинная строка из трех заданных строк");
        } else {
            System.out.println(c+" самая длинная строка из трех заданных строк");
        }

        return a;
    }
}
