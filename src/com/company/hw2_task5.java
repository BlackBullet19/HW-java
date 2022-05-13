package com.company;
/*Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк:
Подсказка: Используйте метод, написанный в пункте 4
Например: longestString (“java”,”welcome”,”hello”) -> “welcome”*/
public class hw2_task5 {
    public static void main(String[] args) {
        String a="welcome to the jungle"; // writing 3 lines, we will need to find longest from them
        String b="highway to hell";
        String c="we are the champions";
        answer(longestString(a, b, c)); // calling to printing method
        // which one calls another method with given lines
    }

    public static String longestString(String a, String b, String c) {
        String longest=""; // appointing line longest to nothing, later this place will take answer
        if((a.length()>=b.length() && a.length()>=c.length())){ // checking condition if line - 'a' is longest
            return longest=a; // when yes use it as answer, when not go on
        } else if(b.length()>=a.length() && b.length()>=c.length()){ // same here just with other line
            return longest=b;
        } else {
            return longest=c; // when to other lines aren't longest, then line 'c' is longest
        }
    }

    public static void answer(String longest){
        System.out.println("самая длинная строка из трех заданных строк '"+longest +"'"); // use the answer from previous
        //method and print it
    }
}
