package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 Пусть дан произвольный список целых чисел.
 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
 3) Найти максимальное значение
 4) Найти среднее значение
 То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
 */

public class Homework3 {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(-100, 100);
            even.add(value);
        }
        System.out.printf("Начальный список целых чисел %s\n", even);
        System.out.println(findMax(even));
        System.out.println(findMin(even));
        System.out.println(aveRage(even));
        removeEven(even);
    }

    public static void removeEven(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Спискок после удаления четных чисел %s", list);
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i: list) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Минимальное значение: ");
        return min;
    }

    public static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.printf("Максимальное значение: ");
        return max;
    }

    public static double aveRage(ArrayList<Integer> list){
        double avg = 0.0;
        for (int i = 0; i < list.size(); i++) {
            avg+=list.get(i);
        }
        System.out.printf("Среднее арифметическое: ");
        return avg/list.size();
    }
}
