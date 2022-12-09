/*
    TODO: Print a star.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Day07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the star: ");
        int size = scan.nextInt();

        ArrayList<ArrayList<Character>> star = new ArrayList<>(size);

        int maxLength = (4 * size) / 3 - 1;
        int triangleHeight = size * 2/3;

        for(int i = 0; i < size; i++) {
            star.add(i, new ArrayList<>());

            for(int j = 0; j < maxLength; j++)
                star.get(i).add(j, ' ');
        }

        //top triangle
        for(int i = 1; i <= triangleHeight; i++)
        {
            for(int j = 1; j <= (2 * i) - 1; j++)
                star.get(i - 1).set((maxLength / 2) - i + j, '*');
        }

        //bottom triangle - reversed
        for(int i = 0; i <= triangleHeight; i++)
        {
            for(int j = 1; j <= (2 * i) - 1; j++)
                star.get(star.size() - i - 1).set((maxLength / 2) - i + j, '*');
        }

        //print the array
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < maxLength; j++)
                System.out.print(star.get(i).get(j));

            System.out.println();
        }

    }
}
