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

public class MakingAnagrams {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {

        // Create lists to count character frequencies
        List<Integer> charCountA = new ArrayList<>(26); // Assuming lowercase English letters (a-z)
        List<Integer> charCountB = new ArrayList<>(26);

        // Initialize the lists with zeros
        for (int i = 0; i < 26; i++) {
            charCountA.add(0);
            charCountB.add(0);
        }

        // Increment counts for characters in the first string (a)
        for (char ch : a.toCharArray()) {
            charCountA.set(ch - 'a', charCountA.get(ch - 'a') + 1);
        }

        // Increment counts for characters in the second string (b)
        for (char ch : b.toCharArray()) {
            charCountB.set(ch - 'a', charCountB.get(ch - 'a') + 1);
        }

        // Calculate the total number of deletions needed
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(charCountA.get(i) - charCountB.get(i));
        }

        return deletions;


    }

}
