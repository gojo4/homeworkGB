package com.company;

import java.util.*;

/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 * 4. Если введено exit, то программа завершается
 * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
 * > java
 * > python
 * > c#
 * > print
 * < [c#, python, java]
 * > revert
 * > print
 * < [python, java]
 * > revert
 * > revert
 * > print
 * < []
 * > revert -> throw new NoSuchElementException
 */
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> storage = new ArrayList<>();

        while (true) {
            String command = scanner.nextLine();
            if ("exit".equals(command)) {
                System.out.println("Exiting the program!");
                System.exit(0);
            }
            if (command.equals("print")) {
                System.out.println(reverseList(storage));

            } else if (command.equals("revert")) {
                if (!storage.isEmpty()) {
                    storage.remove(storage.size() - 1);
                } else if (storage.isEmpty()) {
                    throw new NoSuchElementException();
                }

            } else {
                storage.add(command);

            }
        }
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
}


