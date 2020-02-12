package java1.lesson2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class lesson2 {

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        System.out.println("Задание 1.");
        System.out.println("Создаем массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Меняем местами единицы с нулями: " + Arrays.toString(arr));
    }

    public static void fillArray() {
        System.out.println("Задание 2.");
        int[] arr = new int[8];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  count;
            count += 3;
        }
        System.out.println("Полуаем массив: " + Arrays.toString(arr));
    }

    public static void changeArray() {
        System.out.println("Задание 3.");
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Создаем массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Умножаем числа меньше 6 на 2: " + Arrays.toString(arr));
    }

    public static void fillDiagonal() {
        System.out.println("Задание 4.");
        int[][] arr = new int[5][5];
        int count = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][count] = 1;
            count--;
        }
        System.out.println("Полученный массив: " + Arrays.deepToString(arr));
    }

    public static void arrMinMax(int[] arr) {
        System.out.println("Задание 5.");
        int min = 0; int max = 0;
        //int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = (int) (Math.random() * 100);
            if (arr[i] > max || i == 0) { max = arr[i];}
            if (arr[i] < min || i == 0) { min = arr[i];}
        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        System.out.println("Min = " + min + " / Max = " + max);
    }

    public static boolean BoolArray(int [] arr) {
        System.out.println("Задание 6.");
        boolean bool = false;
        int a = 0;
        int b = 0;
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 3);
//        }
        System.out.println("Полученный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            IntStream stream1 = Arrays.stream(arr, 0, i);
            IntStream stream2 = Arrays.stream(arr, i, arr.length);
            if (stream1.sum() == stream2.sum()) {
                System.out.println("Срез массива [0 : " + (i-1) + "] равен срезу [" + i +" : " + (arr.length -1) + "]!");
                bool = true;
                break;
            }
            if (i == arr.length - 1){
                System.out.println("В массиве нет равных срезов!");
            }
        }
        return bool;
    }

    public static void arrShift(int[] arr, int shift){
        System.out.println("Задание 7.");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        if(shift != 0){
            if (shift > arr.length){
                shift = Math.abs(shift % arr.length);
            }
            if (shift > 0) {
                for (int i = 0; i < shift; i++) {
                    int buffer = arr[0];
                    arr[0] = arr[arr.length - 1];
                    for (int j = 1; j < arr.length - 1; j++) {
                        arr[arr.length - j] = arr[arr.length - j - 1];
                    }
                    arr[1] = buffer;
                }
            } else if (shift < 0) {
                for (int i = 0; i > shift; i--) {
                    int buffer = arr[arr.length - 1];
                    arr[arr.length - 1] = arr[0];
                    for (int j = 1; j < arr.length - 1; j++) {
                        arr[j - 1] = arr[j];
                    }
                    arr[arr.length - 2] = buffer;
                }
            }
        }
        System.out.println("Массив со сдвигом " + shift + ": " + Arrays.toString(arr));

    }


    public static int[] NewArray (int length, int maxNum) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (maxNum + 1));
        }
        return arr;
    }

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        arrMinMax(NewArray(8, 100));
        BoolArray(NewArray(10, 2));
        arrShift(NewArray(6, 10), (int) (Math.random()*21 - 10));
    }
}
