package PracticeTests;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {
    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    // Won't work for all
    // This one just checks differences
    public static int pairs(int k, List<Integer> arr) {

        int equalsk = 0;

        // sort list
        Collections.sort(arr);

        for (int i=1; i < arr.size(); i++) {
            int currentNum = arr.get(i);
            int previousNum = arr.get(i-1);

            int difference = currentNum - previousNum;

            if (difference == k) {
                equalsk++;
            }
        }

        return equalsk;


        // Write your code here

    }


    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairsCorrect(int k, List<Integer> arr) {
        /*
        this implementation effectively counts pairs where the
        sum of two elements equals k by using a HashSet for efficient lookups.
        It's a valid approach and can be more efficient than checking the subtraction of elements.
         */

        int equalsk = 0;

        // Create a HashSet
        Set<Integer> set = new HashSet<>(arr);

        // Just checking if you can make the total, instead of subtracting.
        for (int i: arr) {
            int testVal = i + k;

            if (set.contains(testVal)) {
                equalsk++;
            }

        }

        return equalsk;


        // Write your code here

    }
}
