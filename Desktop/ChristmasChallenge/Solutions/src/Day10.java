/*
    TODO: Draw a candy cane.
 */

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Day10 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the height of the candy cane: ");
        System.out.println();

        int height = scan.nextInt();

        printTop(height / 3);
        printBottom(height / 3);
    }

    //print part of a circle
    public static void printTop(int radius) {
        double distance;

        for (int i = 0; i <= radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                distance = sqrt(pow(i - radius, 2) +
                        pow(j - radius, 2));

                if (distance > radius - 0.5 && distance < radius + 0.5)
                    System.out.print("*" + ANSI_RED + "*" + ANSI_RESET);
                else
                    System.out.print("  ");
            }

            System.out.print("\n");
        }
    }
    //print a line
    public static void printBottom(int radius) {
        int diameter = 2 * radius;
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++)
                System.out.print("  ");

            System.out.println("*" + ANSI_RED + "*" + ANSI_RESET);
        }
    }
}
