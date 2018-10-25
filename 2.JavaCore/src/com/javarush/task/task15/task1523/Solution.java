package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public Solution(int a) {
        System.out.println("public");
    }

    private Solution(int a, int b) {
        System.out.println("private");
    }

    protected Solution(int a, int b, int c) {
        System.out.println("protected");
    }

    Solution(String str) {
        System.out.println("def");
    }

    public static void main(String[] args) {

    }



}

