package org.wcci;
import java.util.Scanner;

public class WarmupProblems {


    /*
     * stringTimes()
     *
     * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
     * string.
     *
     * Examples:
     * - stringTimes("Hi", 2) → "HiHi"
     * - stringTimes("Hi", 3) → "HiHiHi"
     * - stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word...");
        str = input.nextLine();
        System.out.println("Now enter a number...");
        n = input.nextInt();

        for (int i = 0; i < n; i++) ;
        {
            System.out.println(str.toUpperCase());
        }


        //TODO Add the code here that meets the requirements of the problem in the comment above.
        //return null;


        /*
         * icyHot()
         *
         * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
         *
         * Examples:
         * - icyHot(120, -1) → true
         * - icyHot(-1, 120) → true
         * - icyHot(2, 120) → false
         */
        public boolean icyHot(int temp1, int temp2) {
        //TOO Add the code here that meets the requirements of the problem in the comment above.

       // Scanner input = new Scanner(System.in);
        System.out.println("enter 1st Temp");
        temp1 = input.nextInt();
        System.out.println("enter a 2nd temp");
        temp2 = input.nextInt();

        if (temp1 <0 && temp2 > 100){
            System.out.println(true);}
        }else if (temp2 <0 && temp1 > 100) {
            System.out.println(true);

        }else System.out.println(false);



        // reurn false;

    }
}
