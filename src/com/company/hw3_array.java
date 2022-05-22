package com.company;
/*Implement a method that returns how many times the given int are present
in the given array ({10, 3, 23, 5, -9, 1, 3,-7},3) -> 2*/
public class hw3_array {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 10, 3, 23, 5, -9, 1, 3, -7, 3}; // declaring array
        int digit = 3;// declaring int which one we will search for
        System.out.println("В данном массиве значение " + digit + " встречается " + howManyTimesDigitRepeatsInArray(digit, arr) + " раза");
        // calling for method and print the answer
    }

    public static int howManyTimesDigitRepeatsInArray(int digit, int[] arr) { // declaring method
        int res = 0; // declaring result
        for (int j : arr) { // declaring loop to
            if (j == digit) {// search for our int
                res = res + 1; // if int in loop is equal to digit count it to an answer
            }
        }
        return res;  // return answer
    }
}
