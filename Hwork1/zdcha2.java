package Hwork1;

//Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class zdcha2 {
    public static void main(String[] args) {
        System.out.printf("введите целое число: ");

        Scanner input_number = new Scanner(System.in, "Cp866");
        int number = input_number.nextInt();
        input_number.close();

        System.out.printf("списк простых чисел от 1 до %d%n", number);

        for (int i = 1; i <= number; i++) {
            if (primeNum(i)) {
                System.out.printf("%d простое число%n", i);
            }
        }

    }

    public static boolean primeNum(int num) {
        boolean t = false;
        if (num == 2 || num == 3) {
            t = true;
        } else {
            for (int i = 2; i < num; i++) {
                if (i + 1 == num) {
                    t = true;
                    break;
                }
                if ((num % i) == 0) {
                    break;
                }

            }
        }
        return t;
    }
}