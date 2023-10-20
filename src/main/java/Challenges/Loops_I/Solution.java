package Challenges.Loops_I;
/*
//Task
//Given an integer, N, print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer N
//
//Constraints
//  N >= 2 AND N <=20

//Sample Input
//
//2

//Sample Output
//
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20

 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // For values of i from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Formatted string
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
