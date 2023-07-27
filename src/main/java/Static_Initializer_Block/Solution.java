package Static_Initializer_Block;

// Problem: https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true


import java.io.*;
import java.util.*;


public class Solution {

    //Write your code here
    // Static because belongs to class
    static Scanner input = new Scanner(System.in);

    // Read integer inputs
    static int B = input.nextInt();
    static int H = input.nextInt();

    // Define the condition
    static Boolean flag = B > 0 && H > 0;

    // Alt static Boolean flag = B > 0 && H > 0;

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }//end of main

}//end of class




