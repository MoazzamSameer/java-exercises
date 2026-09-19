package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        int num =   9;
        double bigNum = num;
        System.out.println(bigNum + " " + num);



        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.

        double doubleNum = 4.445;
        int intNum = (int) doubleNum;
        System.out.println(doubleNum +" " + intNum);



        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.

        int character = 66;
        char intCharacter = (char) character;
        System.out.println(intCharacter +" " + character);



        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char bigCharacter = 'z';
        int intBigCharacter = (int) bigCharacter;
        System.out.println(intBigCharacter +" " + bigCharacter);



        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        String myString = "42";
        int myString2 = Integer.parseInt(myString);
        System.out.println(myString2 +" " + myString);



        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.

        int numberOne = 42;
        String numberOneString = String.valueOf(numberOne);
        System.out.println(numberOneString +" " + numberOneString);

    }
}
