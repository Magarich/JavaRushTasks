package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {

  public static List<Person> allPeople = new ArrayList<Person>();

  static {
    allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
    allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
  }

  public static void main(String[] args) throws ParseException {
    //start here - начни тут
    String name = "";
    Sex sex = null;
    Date date;
    int id;

    switch (args[0]) {
      case "-c": {
        name = args[1];
        Person tempPerson = null;
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        date = format.parse(args[3]);
        if (args[2].equals("м")) {
          //allPeople.add(Person.createMale(name, date));
          tempPerson = Person.createMale(name, date);
        } else if (args[2].equals("ж")) {
          //allPeople.add(Person.createFemale(name, date));
          tempPerson = Person.createFemale(name, date);
        }
        allPeople.add(tempPerson);
        System.out.println((allPeople.indexOf(tempPerson)));

        break;
      }

      case "-u": {
        name = args[2];
        id = Integer.parseInt(args[1]);
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        date = format.parse(args[4]);

        if (args[3].equals("м")) {

          allPeople.set(id, Person.createMale(name, date));
        } else if (args[3].equals("ж")) {

          allPeople.set(id, Person.createFemale(name, date));

        }

        break;
      }
      case "-d": {
        id = Integer.parseInt(args[1]);
        Person tempPerson = allPeople.get(id);
        tempPerson.setBirthDate(null);
        tempPerson.setName(null);
        tempPerson.setSex(null);
        allPeople.set(id, tempPerson);
        break;
      }
      case "-i": {
        id = Integer.parseInt(args[1]);
        name = allPeople.get(id).getName();
        sex = allPeople.get(id).getSex();
        date = allPeople.get(id).getBirthDate();
        String strSex = sex == Sex.MALE ? "м" : "ж";

        System.out
            .println(name + " " + strSex + " " + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(date));
        break;
      }
    }

  }
}
