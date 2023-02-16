package Hwork6;

// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. 

// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например:	“Введите цифру, соответствующую необходимому критерию:	
// 					1 - ОЗУ
// 					2 - Объем ЖД
// 					3 - Операционная система
// 					4 - Цвет

// 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// приветствие 
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import Hwork6.Notebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<Integer, Notebook> nbDataBase = new HashMap<>();
        nbDataBase = fillData();

        System.out.println("Поиск ноутбука по критерию");
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        switch (count) {
            case (1): {
                Set<Integer> choice = new TreeSet<>();
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    choice.add(currentNb.getRAM());
                }
                System.out.println("В наличии имеются ноутбуки в ОЗУ: ");
                System.out.println(choice);
                System.out.println("введите желаемый обьем в ОЗУ: ");
                Integer count1 = scan.nextInt();
                Boolean flag = false;
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    if (count1.equals(currentNb.getRAM())) {
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("ноутбуков с таким объемом ОЗУ нет");
                }
                break;
            }
            case (2): {
                Set<Integer> choice = new TreeSet<>();
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    choice.add(currentNb.getHDD());
                }
                System.out.println("В наличии имеются ноутбуки в HDD: ");
                System.out.println(choice);
                System.out.println("введите желаемый обьем в HDD: ");
                Integer count1 = scan.nextInt();
                Boolean flag = false;
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    if (count1.equals(currentNb.getHDD())) {
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("ноутбуков с таким объемом HDD нет");
                }
                break;
            }
            case (3): {
                Set<String> choice = new TreeSet<>();
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    choice.add(currentNb.getOS());
                }
                System.out.println("В наличии имеются ноутбуки с ОС: ");
                System.out.println(choice);
                System.out.println("введите желаемую  ОС: ");
                String count1 = scan.next();
                Boolean flag = false;
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    if (count1.equals(currentNb.getOS())) {
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("ноутбуков с такой ОС нет");
                }
                break;
            }
            case (4): {
                Set<String> choice = new TreeSet<>();
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    choice.add(currentNb.getColour());
                }
                System.out.println("В наличии имеются ноутбуки цветов: ");
                System.out.println(choice);
                System.out.println("введите желаемый цвет: ");
                String count1 = scan.next();
                Boolean flag = false;
                for (int i = 1; i <= nbDataBase.size(); i++) {
                    Notebook currentNb = nbDataBase.get(i);
                    if (count1.equals(currentNb.getColour())) {
                        printNb(currentNb);
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("ноутбуков такого цвета нет");
                }
                break;
            }
        }
    }

    public static HashMap fillData() {

        Notebook nb1 = new Notebook("ASUS", "Black", "WIN10", 32, 1024, 100000);
        Notebook nb2 = new Notebook("Apple", "Pink", "MACOS", 16, 512, 150000);
        Notebook nb3 = new Notebook("Lenovo", "Silver", "WIN11", 32, 2048, 70000);
        Notebook nb4 = new Notebook("Lenovo", "Black", "WIN11", 16, 1024, 60000);
        Notebook nb5 = new Notebook("HP", "Silver", "WIN10", 32, 512, 120000);

        Map<Integer, Notebook> DataBase = new HashMap<>();
        DataBase.put(1, nb1);
        DataBase.put(2, nb2);
        DataBase.put(3, nb3);
        DataBase.put(4, nb4);
        DataBase.put(5, nb5);

        return (HashMap) DataBase;
    }

    public static void printNb(Notebook currentNb) {
        System.out.printf("название %s, цвет %s, ОС: %s, ОЗУ %d, HDD %d, цена: %d \n", currentNb.getName(),
                currentNb.getColour(), currentNb.getOS(), currentNb.getRAM(), currentNb.getHDD(), currentNb.getPrice());
    }

}