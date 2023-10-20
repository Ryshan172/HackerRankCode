package PracticeTests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {

        String[] list1 = s1.split("");
        String[] list2 = s2.split("");

        for (String char1: list1) {
            for (String char2: list2) {
                if (char1.equals(char2)){
                    return "YES";
                }
            }
        }

        return "NO";

        // Write your code here

    }

    public static String twoStringsAlt(String s1, String s2) {
        // Create a set to store characters from the first string
        HashSet<Character> charSet = new HashSet<>();

        // Iterate through the characters in the first string and add them to the set
        for (char i : s1.toCharArray()) {
            charSet.add(i);
        }

        // Iterate through the characters in the second string
        for (char j : s2.toCharArray()) {
            // If a character from the second string is found in the set, return "YES"
            if (charSet.contains(j)) {
                return "YES";
            }
        }

        // If no common character is found, return "NO"
        return "NO";
    }
}
