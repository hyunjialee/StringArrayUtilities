package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String x = String.valueOf(array.length - 1);
        return array[Integer.parseInt(x)];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String x = String.valueOf(array.length - 2);
        return array[Integer.parseInt(x)];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        // copy of array
        // reverse the array

        for (int i = 0; i < array.length / 2; i++) {

            array[i].equals(array[array.length - i - 1]);

            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // need a for loop to check every value of the array
        // .replaceAll("[^a-z]", "")
        //      .replaceAll("(.)(?=.*\\1)", "")
        //      .length() == 26;
        // ------------ USING REGEX for eliminating characters except the alphabet, then removing duplicate character
        // Finally line is counting letters and making sure there is 26 letters
        boolean[] usedLetter = new boolean[26];

        for (String used : array) {
            used = used.toLowerCase();

            for (char c : used.toCharArray()) {
                if (Character.isLetter(c)) {
                    usedLetter[c - 'a'] = true;
                }
            }
        }
        for (boolean repeat : usedLetter) {
            if (!repeat) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String element : array) {
            if (element.equals(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = getNumberOfOccurrences(array, valueToRemove);
        String[] removedValue = new String[array.length - count];
        int index = 0;

        for (String str : array) {
            if (!str.equals(valueToRemove)){
                removedValue[index] = str;
                index++;
            }
        }
        return removedValue;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        int n = array.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (!array[i].equals(array[i - 1])) {
                count++;
            }
        }
        String[] result = new String[count];
        result[0] = array[0];
        int index = 1;

        for (int i = 1; i < n; i++) {
            if (!array[i].equals(array[i - 1])) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

//        int n = array.length;
//        ArrayList<String> result = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String str = array[i];
//
//            while (i < (n-1) && array[i].equals(array[i + 1])) {
//                i++;
//            }
//            result.add(str);
//        }
        return null;
    }
}
