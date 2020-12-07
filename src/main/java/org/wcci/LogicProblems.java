package org.wcci;

import java.util.Scanner;

public class LogicProblems {
    /*
     * squirrelPlay()
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
     * 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     * Examples:
     * - squirrelPlay(70, false) → true
     * - squirrelPlay(95, false) → false
     * - squirrelPlay(95, true) → true
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.


        Scanner input = new Scanner(System.in);
        int maxTemp = 91;
        int lowTemp = 59;
        int summerMax = 101;;
        System.out.println("Is it summertime?");
        String summerTime = input.nextLine();
        System.out.println("What is the temperature outside?");
        double currentTemp = input.nextDouble();

        for (summerTime = "yes"; currentTemp>lowTemp && currentTemp<summerMax; ){
            System.out.println("The squirrels are playing");
        }
        for (summerTime = "no"; currentTemp>lowTemp && currentTemp< maxTemp;)
            System.out.println("The squirels are not playing today");
        return false;
    }

    /*
     * nearTen()
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     *
     * Examples:
     * - nearTen(12) → true
     * - nearTen(17) → false
     * - nearTen(19) → true
     */
    public boolean nearTen(int num) {
        //TODO Add the code here that meets the requirements of the problem in the comment above.
        return false;
    }

}

