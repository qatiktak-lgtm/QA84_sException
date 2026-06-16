package h_w_18;

import java.util.ArrayList;

public class MainHwork18 {
    public static void main(String[] args) {

        //Task#1
        System.out.println("Task#1");
        String str1 = "999 999 999", str2 = "2147483646";
        try {
            int newSum = parseAndSum2(str1, str2);
            System.out.println("Sum str1 & str2 = " + newSum);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //Task#2
        System.out.println("~".repeat(50));
        System.out.println("Task#2");
        int[] ar22 = {9, -2, 7, 1};
        int index22 = 2;
        String s22 = " ";
        try {
            int myFindSum = findSum(ar22, index22, s22);
            System.out.println("Sum ar22[index22] + s22 = " + myFindSum);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //Task#3

        System.out.println("~".repeat(50));
        System.out.println("Task#3");
        String[] ar33 = {"2.4", "7.8", "6.1", "-2.3", "9.4"};
        int index31 = 2;
        int index32 = 6;
        try {
            double myParseSum = findParseSum(ar33, index31, index32);
            System.out.println("Сумма элементов: " + myParseSum);
        } catch (NullPointerException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }




    // Task#1
    public static int parseAndSum2(String s1, String s2)
            throws NullPointerException, NumberFormatException, IllegalArgumentException {
        if (s1 == null || s2 == null) {
            NullPointerException e = new NullPointerException("String is null");
            throw e;
        }
        if (s1.isBlank() || s2.isBlank()) {
            IllegalArgumentException e = new IllegalArgumentException("The string cannot be empty");
            throw e;
        }
        // другая форма записи
        if (!s1.matches("-?\\d+")) {
            throw new IllegalArgumentException("String s1 contains spaces or incorrect characters!");
        }
        if (!s2.matches("-?\\d+")) {
            throw new IllegalArgumentException("String s2 contains spaces or incorrect characters!");
        }


        int res01;
        try {
            res01 = Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("The s1 string is overflowing!");
        }

        int res02;
        try {
            res02 = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("The s2 string is overflowing!");
        }
        long longSum = (long) res01 + (long) res02;
        if (longSum < Integer.MIN_VALUE || longSum > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("The Sum of numbers s1 + s2 does not fit into int!");
        }
        return (int) longSum;
    }

    // Task#2
    public static int findSum(int[] ar, int index, String s) throws
            NullPointerException, ArrayIndexOutOfBoundsException,
            IllegalArgumentException {
        if (ar == null) {
            throw new NullPointerException("Array is null");
        }
        if (index < 0 || index >= ar.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        if (s == null) {
            throw new NullPointerException("String is null");
        }
        if (s.isBlank()) {
            throw new IllegalArgumentException("String is empty or blank");
        }
        int res;
        try {
            res = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw e;
        }
        return ar[index] + res;
    }

    // Task#3
    //ar-> ["2.4"]["7.8"]["6.1"]["-2.3"]["9.4"]
    public static double findParseSum(String[] ar, int index1, int index2)
            // hrows NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException  - это можно убрать, Java всё равно позволит бросать throw
    {
        if (ar == null) {
            throw new NullPointerException("Array is null or cell is null");
        }
        if (ar.length == 0) {
            throw new IllegalArgumentException("Array length is empty");
        }
        if (index1 < 0 || index1 >= ar.length || index2 < 0 || index2 >= ar.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        double res31;
        double res32;
        try {
            if (ar[index1] == null || ar[index2] == null) {
                throw new NullPointerException("One of the lines or both is null");
            }
            res31 = Double.parseDouble(ar[index1]);
            res32 = Double.parseDouble(ar[index2]);
            return res31 + res32;
        } catch (NumberFormatException e) {System.out.println("Error translating line into number: "
                + e.getMessage());
            return 0.0;
        }

    }

}


