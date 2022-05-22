package com.company;
/*Implement a method that returns how many times the given int are present
in the given array ({10, 3, 23, 5, -9, 1, 3,-7},3) -> 2*/
public class hw3_array {
    public static void main(String[] args){
        int[] arr= new int[]{-3, 10, 3, 23, 5, -9, 1, 3, -7, 3};
        int digit =3 ;
        System.out.println("В данном массиве значение "+ digit + " встречается " + howManyTimesDigitRepeatsInArray(digit, arr)+ " раза");
    }
    public static int howManyTimesDigitRepeatsInArray(int digit, int[] arr){
        int res=0;
        for (int j : arr) {
            if (j == digit) {
                res = res + 1;
            }
        }
        return res;
    }
}
