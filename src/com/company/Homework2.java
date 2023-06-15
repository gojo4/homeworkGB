package com.company;
/**
 * 1. Реализовать метод isPalindrome
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */
public class Homework2 {
    public static void main(String[] args) {
//        String str = "sdgsdgsdgsdsd";
//        String str = "abbabba";
        String str = "abcdcba";
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }

    public static boolean isPalindrome(String str) {
        String val = "";
        boolean answer = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            val = val + str.charAt(i);
        }
        if (str.equals(val)) {
            answer = true;
        }
        return answer;
    }
}
