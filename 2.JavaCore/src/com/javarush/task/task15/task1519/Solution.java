package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String T = "";
        while (true) {
            T = reader.readLine();
            if(T.equals("exit")) break;
            list.add(T);
        }
        System.out.println(list);
        for (String str : list) {
            try{
                Double.parseDouble(str);
                if(str.indexOf(".") != -1){
                print(Double.parseDouble(str));
                continue;
                }
            }
            catch (Exception e){}

            try{
                Short.parseShort(str);

                if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128){
                print(Short.parseShort(str));
                continue;
                }
            }
            catch (Exception e){}

            try {
                Integer.parseInt(str);

                if(Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128 ) {
                    print(Integer.parseInt(str));
                    continue;
                }
            }
            catch (Exception e){}
            print(str);

        }
    }


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
