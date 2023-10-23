package PracticeTests;

public class Fibonacci {

    public static int fibonacci(int n) {

        // Return the nth element in the fibonacci sequence

        int answer = 0;

        if (n == 0) {
            answer = 0;
        }

        else if (n == 1 || n == 2) {
            answer = 1;
        }

        else {
            answer = fibonacci(n -1) + fibonacci(n -2);
        }

        return answer;


        // Complete the function.
    }
}
