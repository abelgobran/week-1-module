package org.wcci;
import java.util.Scanner;


public class StringProblems {


    public String smallestStringSorter(String stringA, String stringB) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String..");
        stringA = input.nextLine();
        System.out.println("Enter another string..");
        stringB = input.nextLine();


        if (stringA.length() < stringB.length()) {
            System.out.println(stringB);

        } else if (stringB.length() < stringB.length()) {
            System.out.println(stringA);
        } else System.out.println(stringA + stringB);


        return null;
    }



    /*
     * evenUpperCaseOrOddLowerCase()
     *
     * Given a string, str, transform the string's characters to upper case characters if the length is even or lower
     * case if the length is odd.
     *
     * Examples:
     * - evenUpperCaseOrOddLowerCase("Hello") -> "hello"
     * - evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz") -> "ZIZZER ZAZZER ZUZZ"
     */
    public String evenUpperCaseOrOddLowerCase(String str){
        //TODO Add the code here that meets the requirements of the problem in the comment above.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1 = input.nextLine();
        int count = str1.length();


        if (count % 2 == 0) {
            System.out.println(str1.toUpperCase());

        }else if (count % 2 != 0) {
            System.out.println(str1.toLowerCase());
        }


        return null;
    }

    /*
     * stringCombiner()
     *
     * Given two strings, stringA and stringB, return a new string that combines the two strings, but the strings should
     * be combined in ascending alphabetically order.
     *
     * Examples:
     * - stringCombiner("Hello", "There") -> "HelloThere"
     * - stringCombiner("Zizzer" "zazzer") -> "zazzerZizzer"
     */
    public String stringCombiner(String stringA, String stringB){
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        stringA = "String one" ;
        stringB = "String two";

        int difference = stringA.compareTo(stringB);
        if (stringA.compareTo(stringB) == 0 ) {
            System.out.println(stringA+stringB);
        }else if (stringB.compareTo(stringA) > 0 )
            System.out.println(stringB + stringA);


        return null;
    }

    /*
     * left2()
     * Given a string, str, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
     * will be at least 2.
     *
     * Examples:
     * - left2("Hello") → "lloHe"
     * - left2("java") → "vaja"
     * - left2("Hi") → "Hi"
     */

    public String left2(String str){
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        return null;
    }
}
