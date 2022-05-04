package com.company;

public class task4 {
    public static void main(String[] args) {
        String str = "java is not easy!";
        //System.out.println(str.substring(0, 5));
        System.out.println(substring(str, 0 ,7));
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