package Hwork3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer arrayLenght = rnd.nextInt(1, 10);
        System.out.printf("будет создан массив длиной %d \n", arrayLenght);
        ArrayList<Integer> ArrayList = new ArrayList<>();
        ArrayList = ArrayGen(ArrayList, arrayLenght);

        ArrayPrint(ArrayList);
        System.out.printf("минимальный элемент списка  =  %d \n", listMin(ArrayList));
        System.out.printf("максимальный элемент списка  =  %d \n", listMax(ArrayList));
        System.out.printf("среднее арифметическое значений списка  =  %f \n", listAverage(ArrayList));
    }

    public static ArrayList<Integer> ArrayGen(ArrayList ArrList, Integer count) {
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            ArrList.add(rnd.nextInt(0, 10));
        }
        return ArrList;
    }

    public static void ArrayPrint(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf(" %d", arr.get(i));
        }
        System.out.println("");
    }

    public static Integer listMin(ArrayList arr) {
        Integer min = (Integer) arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if ((Integer) arr.get(i) < min) {
                min = (Integer) arr.get(i);
            }
        }
        return min;
    }

    public static Integer listMax(ArrayList arr) {
        Integer max = (Integer) arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if ((Integer) arr.get(i) > max) {
                max = (Integer) arr.get(i);
            }
        }
        return max;
    }

    public static float listAverage(ArrayList arr) {
        float average = 0;
        for (int i = 1; i < arr.size(); i++) {
            average = average + (Integer) arr.get(i);
        }
        average = average / arr.size();
        return average;
    }
}
