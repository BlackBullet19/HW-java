package com.company;

public class task3 {
    public static void main(String[] args) {
        String hi = "hello";
        //for (int i = hi.length() - 1; i >= 0; i--) {
        // System.out.print(hi.charAt(i));
        System.out.print(reverse(hi, 0, 4));
    }

    public static String reverse(String hi, int start, int end){
        String result="";
        for(int i=end; i>=start;i--){
            char ch=hi.charAt(i);
            result=result+ch;
        }
        return result;

    }
}
