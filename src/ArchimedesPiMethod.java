/**
 *
 * @author Trevor Hatman
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {

        //Prompts user for sides to estimate by.
        System.out.printf("How many sides?: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double angleB = 360.0 / n;
        double angleA = angleB / 2;
        double sideS = 2 * Math.sin(Math.toRadians(angleA));
        double perimeter = sideS * n;
        double estimate = perimeter / 2;

        System.out.printf("Estimate of PI is: %.10f%n", estimate);
    }
}
