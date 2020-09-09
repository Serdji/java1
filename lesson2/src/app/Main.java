package app;

import java.util.Arrays;

public class Main {
    private static final TaskOne taskOne = new TaskOne();
    private static final TaskTwo taskTwo = new TaskTwo();
    private static final TaskThree taskThree = new TaskThree();
    private static final TaskFour taskFour = new TaskFour();
    private static final TaskFive taskFive = new TaskFive();
    private static final TaskSeven taskSeven = new TaskSeven();

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task7();
    }

    private static void task1() {
        System.out.println("-------------------Задание 1-------------------");
        int[] binaryArr = {1, 0, 0, 1, 1, 0};
        System.out.println(Arrays.toString(taskOne.binaryArrInvert(binaryArr)));
        System.out.println("-----------------------------------------------");
    }

    private static void task2() {
        System.out.println("-------------------Задание 2-------------------");
        System.out.println(Arrays.toString(taskTwo.generateArrSize(12, 4)));
        System.out.println("-----------------------------------------------");
    }

    private static void task3() {
        System.out.println("-------------------Задание 3-------------------");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(taskThree.multiArr(arr, 6, 2)));
        System.out.println("-----------------------------------------------");
    }

    private static void task4() {
        System.out.println("-------------------Задание 4-------------------");
        for (int[] datum : taskFour.initMatrixArr(23, 5)) {
            for (int i : datum) {
                System.out.printf("%3d ", i);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }

    private static void task5() {
        System.out.println("-------------------Задание 5-------------------");
        int[] arr = {11, 5, 2, 10, 7, 9, 4, 8};
        System.out.println(Arrays.toString(taskFive.minAndMax( arr )));
        System.out.println("-----------------------------------------------");
    }

    private static void task7() {
        System.out.println("-------------------Задание 7-------------------");
        int[] arr = {11, 5, 2, 10, 7, 9, 4, 8};
        System.out.println(Arrays.toString(taskSeven.shiftArr( arr, -3 )));
        System.out.println("-----------------------------------------------");

    }
}
