package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 * Реализовать консольное приложение - телефонный справочник.
 * У одной фамилии может быть несколько номеров.
 * Пользователь может вводить команды:
 * 1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
 * 2. GET Ivanov - получить список всех номеров по фамилии
 * 3. REMOVE Ivanov - удалить все номера по фамилии
 * 4. LIST - Посмотреть все записи
 * 5. EXIT - Завершить программу
 * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
 * <p>
 * <p>
 * Пример взаимодействия (=> - это вывод на консоль):
 * ADD Ivanov 8 800 555 35 35
 * ADD Ivanov 8 800 100 10 10
 * GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
 * ADD Petrov 8 555 12 34
 * LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
 * REMOVE Ivanov
 * LIST => Petrov = [8 555 12 34]
 * GET NoName => Не найдена запись с фамилией "NoName"
 * REMOVE NoName => Не найдена запись с фамилией "NoName"
 */
public class Homework5 {
    private static Map<String, Set<String>> contacts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду: ");
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            if (command[0].equalsIgnoreCase("ADD")) {
                addContact(command[1], command[2]);
            } else if (command[0].equalsIgnoreCase("GET")) {
                getContact(command[1]);
            } else if (command[0].equalsIgnoreCase("REMOVE")) {
                removeContact(command[1]);
            } else if (command[0].equalsIgnoreCase("LIST")) {
                listContacts();
            } else if (command[0].equalsIgnoreCase("EXIT")) {
                break;
            } else {
                System.out.println("Некорректная команда");
            }
        }

        scanner.close();
    }

    private static void addContact(String surname, String phoneNumber) {
        if (contacts.containsKey(surname)) {
            Set<String> numbers = contacts.get(surname);
            numbers.add(phoneNumber);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(phoneNumber);
            contacts.put(surname, numbers);
        }

        System.out.println("Данные добавлены");
    }

    private static void getContact(String surname) {
        if (contacts.containsKey(surname)) {
            Set<String> numbers = contacts.get(surname);
            System.out.println("Номера телефонов по запрашиваемой фамилии " + surname + ":");
            for (String number : numbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("Данные по " + surname + " отсутствуют");
        }
    }

    private static void removeContact(String surname) {
        if (contacts.containsKey(surname)) {
            contacts.remove(surname);
            System.out.println("Данные по фамилии " + surname + " удалены");
        } else {
            System.out.println("Данные по " + surname + " отсутствуют");
        }
    }

    private static void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Справочник пуст");
        } else {
            System.out.println("Данные хранящиеся в справочнике:");
            for (Map.Entry<String, Set<String>> entry : contacts.entrySet()) {
                String surname = entry.getKey();
                Set<String> numbers = entry.getValue();

                System.out.println("Фамилия: " + surname);
                System.out.println("Номера телефонов:");
                for (String number : numbers) {
                    System.out.println(number);
                }
                System.out.println();
            }
        }
    }
}
