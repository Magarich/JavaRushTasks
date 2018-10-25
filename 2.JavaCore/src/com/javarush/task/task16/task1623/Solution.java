package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads = 0;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            countCreatedThreads++;
            super.setName(String.valueOf(countCreatedThreads));
            start();
        }
        public void run(){
            if(countCreatedThreads < Solution.count)
            System.out.println(new GenerateThread());
        }

        @Override
        public String toString() {
            return super.getName() + " created";
        }
    }
}
