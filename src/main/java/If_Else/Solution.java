package If_Else;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//  Task
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird


//
//Input Format
//
//A single line containing a positive integer, .
//


//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.


//Sample Input 0
//
//3
//Sample Output 0
//
//Weird


//Sample Input 1
//
//24
//Sample Output 1
//
//Not Weird

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (n%2>0) {
            System.out.println("Weird");
        }
        else {

            if (n >= 2 && n <= 5) {

                System.out.println("Not Weird");

            }

            else if (n >= 6 && n <= 20) {

                System.out.println("Weird");

            }

            else {
                System.out.println("Not Weird");
            }

        }


    }
}
