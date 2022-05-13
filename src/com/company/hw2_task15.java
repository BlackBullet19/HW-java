package com.company;
/*Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
который вместо заданной строки с номером счета (например ”DE5128279087265”)
возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
засекреченных цифр)*/
public class hw2_task15 {
    public static void main(String[] args) {
        String iban="DE5128279087265";// our account number
        System.out.print(ibanSecuring(iban));// calling for method and printing answer together
  }
  public static String ibanSecuring(String iban){
        String securedIban = ""; // our empty yet result
        for(int i = 0; i<iban.length(); i++){// creating loop to take characters one by one
            if(i>3 && i<iban.length()-2){ //checking position of character
                securedIban+='*'; // if it meets our condition replace character with * and write it in new String
        } else {
            securedIban+=iban.charAt(i);// if not, don't replace. Just write it down in new String
    }

    }
      return securedIban; // give back customized String
  }
}
