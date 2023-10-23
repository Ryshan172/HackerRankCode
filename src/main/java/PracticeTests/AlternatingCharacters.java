package PracticeTests;

public class AlternatingCharacters {
    /*
    You are given a string containing characters A  and B only.
     Your task is to change it into a string such that there are
     no matching adjacent characters. To do this, you are allowed to delete zero
     or more characters in the string.
     Your task is to find the minimum number of required deletions.
     */

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {

        // Initialise count
        int deletions = 0;

        /* If the current character and next character
        is the same then it is not an AB pair
        */
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                deletions++;
            }
        }

        return deletions;


    }

}
