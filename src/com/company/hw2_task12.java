package com.company;
/*Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
символов начиная с конца одинаковые у обеих строк.*/
public class hw2_task12 {
    public static void main(String[] args){

        String java1="105555554"; // defining lines
        String java2="1105555554";
        System.out.println(stringEndSameCharCount(java1,java2)); //calling for method and when it's finished print an answer
    }
    public static int stringEndSameCharCount(String java1, String java2){


        int result=0; // this will be an answer, now just defining it as variable
        if(java1.length()>java2.length()){ // looking which line is longer to use it in loop
           int i =java2.length()-1;//short // this one is short, we will use it to stop a loop trying not to catch an error
           //int j=java1.length()-1;//long/ i write it only for me to not make a mistake
            for(int j=java1.length()-1;j>=java1.length()-1-i;j--){ // creating a loop which starts from end of long line
                // ends loop when short line is finished , takes letters one by one
                if(java1.charAt(j)==java2.charAt(j-(java1.length()-java2.length()))){
                    // condition, if letters from both lines are the same...
                    result=result+1;// when same, sum +1 to answer...
                } else {
                    break; // when not, stop loop
                }
            }
        } else { // now other variant, when other line is longer
           int i=java1.length()-1;//short
          // int j=java2.length()-1;//long
            for(int j=java2.length()-1;j>=java2.length()-1-i;j--){
            if(java1.charAt(j-(java2.length()-java1.length()))==java2.charAt(j)){
                result=result+1;
            } else {
                break; // code here is absolute same, only changing line name 1=>2 and 2=>1
            }
        }
        }
        return result; // return answer
    }
}
