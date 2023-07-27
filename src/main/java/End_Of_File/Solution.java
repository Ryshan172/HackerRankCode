package End_Of_File;

/*
The challenge here is to read n lines of input until you reach EOF, then number and print all

lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.

 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // New scanner
        Scanner input = new Scanner(System.in);

        // Define String to read
        String line;

        // Start point for iteration
        int i = 1;

        // While there are new lines to read, print the line number and line
        while(input.hasNext()) {

            line = input.nextLine();
            System.out.println(i + " " + line);
            i++;
        }

        // Close the scanner - may not be necessary
        input.close();
    }


}
