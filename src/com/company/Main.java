package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> myStringList = new ArrayList<>();

    public static void main(String[] args) {
        myStringList.add("Serkan");
        myStringList.add("Bal");
        myStringList.add("GA_NYC");
        myStringList.add("Turkey");
        myStringList.add("Istanbul");
        stringLengthOrValue("Osma");
        reversedOrder();
        int[] myArray = {5, 9, 15 };
        System.out.println(maxValue(myArray));
        double[] myArray1 = {2, 3, 10, 5};
        System.out.println(sumOfValues(myArray1));
        char[] myArray3 = {'s', 'e', 'r', 'k', 'a', 'n'};
        System.out.println(charToString(myArray3));
        stringLists();
        reversedStringOrder(myStringList);
        printOrAdd(myStringList);
        findMiddle(myArray);
    }

    //1st
    public static void stringLengthOrValue(String str) {
        if (str.length() > 5) {
            System.out.println(str);
        } else System.out.println(str.length());
    }

    //2nd
    public static void reversedOrder() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    //3rd
    public static int maxValue(int[] num) {
        int maximum = num[0];
        for (int i = 0; i < num.length; i++) {
            if ( num[i] > maximum) {
                maximum = num[i];
            }
        }
        return maximum;
    }

    //4th
    public static double sumOfValues(double[] num) {
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
        sum = sum + num[i];
        }
        return sum;
    }

    //5th
    public static String charToString(char[] num) {
        String str = new String (num);
        return str;
    }


    //6th
    public static void stringLists() {

        for (int i = 0; i < myStringList.size(); i++) {
            System.out.println(myStringList.get(i));
        }

    }

    //7th
    public static void reversedStringOrder(List<String> myStringList) {

        for (int i = myStringList.size() - 1; i >= 0 ; i--) {
            System.out.println(myStringList.get(i));
        }
    }


    //8th
    public static void printOrAdd(List<String> myStringList) {
        if (myStringList.size() == 10) {
            for (int i = 0; i < myStringList.size(); i++) {
                System.out.println(myStringList.get(i));
            }
        } else {
            myStringList.add("NewString1");
            myStringList.add("NewString2");
            myStringList.add("NewString3");
            myStringList.add("NewString4");
            myStringList.add("NewString5");
            for (int i = 0; i < myStringList.size(); i++) {
                System.out.println(myStringList.get(i));
            }
        }
    }
    
    //9th
    public static void findMiddle(int[] num) {
        int middleIndex = (num.length - 1) / 2;
        if (num.length % 2 != 0) {
            System.out.println(num[middleIndex]);
        } else System.out.println("Only if the array has an odd number of elements in it; it has a middle index. " +
                "Sorry!");
    }

}
