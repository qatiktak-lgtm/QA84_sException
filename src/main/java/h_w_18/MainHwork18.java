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
        String s22 = "6";
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
        /*
        System.out.println("~".repeat(50));
        System.out.println("Task#3");
        String[] ar33 = {"2.4", "7.8", "6.1", "-2.3", "9.4"};
        int index31 = 2;
        int index32 = 0;
        try {
            int myParseSum =
    */

        }



        public static int parseAndSum2 (String s1, String s2)
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


        public static int findSum ( int[] ar, int index, String s) throws
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

//        public static double findParseSum (String[]ar,int index1, int index2)
//
//        {
//
//        }

    }


