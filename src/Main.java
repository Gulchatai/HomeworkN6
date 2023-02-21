
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i++) {
            if (i % 2 == 0) {
                System.out.println("Число четное " + i);
            }
            i = i + 2;
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Год является високосным " + i);
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }
    public static void task7() {
        System.out.println("Задача 6");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int income = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + income;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total +  " рублей");
        }
        System.out.println("Итого за год получим " + total +  " рублей");
    }
    public static void task9() {
        System.out.println("Задача 9");
        int income = 30000;
        int total = 0;
        int depositInterest = 0;
        for (int i = 1; i <= 12; i++) {
            depositInterest = income/100 * i;
            total = total + income + depositInterest;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (total) +  " рублей");
        }
        System.out.println("Итого за год получим " + (total) +  " рублей");
    }
    public static void task10() {
        System.out.println("Задача 10");
        int multiplier = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = multiplier * i;
            System.out.println("2 * " + i +  " = " + result);
        }
    }
}