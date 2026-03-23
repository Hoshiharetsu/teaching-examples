import java.util.Scanner;
/**
 * The Concept: Modular arithmetic and equivalence classes.
 * The Challenge: Write a function to implement a basic shift cipher. It should take a string and an integer k, shifting each letter forward in the alphabet by k positions, wrapping around from 'z' back to 'a'. Once that works, ensure it handles negative k values to decode the message.
 * Coding Focus: It reinforces how to use the modulo % operator and character ASCII/Unicode manipulation. Java and Python actually handle negative numbers with the modulo operator slightly differently, which presents an interesting debugging scenario.
 */
public class ModularShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Version 2: Adding user input and control for a message to encode and shift value:
        System.out.println("What message would you like to encode? ");
        String message = input.nextLine();
        System.out.println("What number would you like to shift the message by? ");
        int k = input.nextInt();
        System.out.println("Your encoded message is: " + shiftMessage(message, k));
    }

    public static String shiftMessage(String message, int k) {
        String encodedMessage = ""; //So the String variable is not null.

        for(int i = 0; i < message.length(); i++){
            char currentChar = message.charAt(i); //Extract the current character based on the for-loop index value.
            /*
            Version 1:
            encodedMessage += (char) (((((currentChar - 'a') + k) % 26) + 26) % 26 + 'a');
             */

            //Version 2, Cleaning up the encodedMessage formula:
            int charValue = currentChar - 'a';
            int valueShift = (charValue + k) % 26;
            int trueMod = (valueShift + 26) % 26;
            char finalChar = (char) (trueMod + 'a');
            encodedMessage += finalChar;
        }

        return encodedMessage;
    }
}
