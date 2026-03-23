/***
 * The following program demonstrates another common CS Programming problem.
 * The goal of the program is to calculate the factorial of a number using recursion.
 * Factorial Reminder:
 * A factorial is the product of all positive integers less than or equal to a given positive integer. It is denoted by the symbol "!" and is defined as:
 * n! = n * (n-1) * (n-2) * ... * 1
 * For example, 5! = 5 * 4 * 3 * 2 * 1 = 120
 * Overall Task Notes:
 *  1. Write a function to return the factorial of a number.
 *  2. Solution can be iterative or recursive.
 *  3. Support for trapping negative n numbers is optional.
 */

public class FactorialProblem {
    public static void main(String[] args) {
        //Go one step further: Create a user input to ask for a value and then show the user the Factorial.
        System.out.println(findingTheFactorial(20)); //Try changing the input value to different values. Remember to note the data type and what output you are getting.
    }

    //Encouraged: Try changing the data type between int and long: What happens to the output?
    private static long findingTheFactorial(long n){
        if(n<=0){
            return 1;
        }else{
            return n*findingTheFactorial(n-1);
        }
    }
}
