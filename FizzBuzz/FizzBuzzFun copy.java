public class FizzBuzzFun {
    public static void main(String[] args){
        System.out.print("Welcome to a Java Demo of FizzBuzz!\n" +
                "This is a common programming problem many new programmers work with.\n" +
                "The primary task of FizzBuzz is: \n" +
                "Write a program that prints integers from 1 to 100.\n" +
                "\t For multiples of 3, print Fizz instead of the number.\n" +
                "\t For multiples of 5, print Buzz instead of the number.\n" +
                "\t For multiples of 3 and 5, print FizzBuzz instead of the number.");

    //So let's start thinking about this: We need a way to work through values 1 to 100 (inclusive) and determine if the current number is a multiple of 3, 5, or both. ASK YOURSELF: What are some tools we know that can iterate through a series of values?

        // What is an operator that we can use to check if something is a multiple of 3, 5, or both?
        // We know the range: 1 to 100 (inclusive) What type of loop do we know of that can be used when the total needed loops is known?

        //Refactored Answer:
        for(int i = 1; i <= 100; i++){
            System.out.println(getFizzBuzzValue(i));
        }
    }

    //Refactored to simplify the logic:
    public static String getFizzBuzzValue(int i) {
        // Returns Fizz, Buzz, FizzBuzz, or the number itself
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}