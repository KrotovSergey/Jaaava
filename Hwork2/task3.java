package Hwork2;
// является ли число полиндромом

import java.util.Scanner;
import java.lang.StringBuffer;

public class task3 {
    public static void main(String[] args) {
        System.out.println("введите строку");
        Scanner input_str = new Scanner(System.in);
        String strng = input_str.next();
        input_str.close();
        String reversedString = new StringBuffer(strng).reverse().toString();

        if (strng.equals(reversedString)) {
            System.out.println("строка является полиндромом");
        } else {
            System.out.println("строка является не полиндромом");
        }

    }
}
