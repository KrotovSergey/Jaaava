package Hwork3;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer arrayLenght = rnd.nextInt(1, 10);
        System.out.printf("будет создан массив длиной %d \n", arrayLenght);
        ArrayList<Integer> ArrayList = new ArrayList<>();
        ArrayList = ArrayGen(ArrayList, arrayLenght);

        ArrayPrint(ArrayList);

        ArrayList = ArrDelElements(ArrayList);

        System.out.printf("удаляем четные числа \n");
        ArrayPrint(ArrayList);

    }

    public static ArrayList<Integer> ArrayGen(ArrayList ArrList, Integer count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            ArrList.add(rnd.nextInt(0, 10));
        }
        return ArrList;
    }

    public static ArrayList<Integer> ArrDelElements(ArrayList Arr) {
        for (int i = 0; i < Arr.size(); i++) {
            if (isOdd((Integer) (Arr.get(i)))) {
                Arr.remove(i);
                i--;
            }
        }
        return Arr;
    }

    public static boolean isOdd(Integer number) {
        boolean result = false;
        if (number % 2 == 0) {
            result = true;
        }
        return result;
    }

    public static void ArrayPrint(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf(" %d", arr.get(i));
        }
        System.out.println("");
    }
}
