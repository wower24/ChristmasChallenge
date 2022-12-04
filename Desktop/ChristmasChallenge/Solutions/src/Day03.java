/*
    TODO: Print a christmas tree.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day03
{
    //green - the tree color
    public static final String TEXT_GREEN  = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED    = "\u001B[31m";
    public static final String TEXT_RESET  = "\u001B[0m";

    public static void main(String[] args)
    {
        String color = TEXT_RESET;

        int height;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height of Christmas Tree");
        height = scan.nextInt();

        printChristmasTree1(height);

        System.out.println(color + "Now let's decorate!");

        printChristmasTree2(height);
    }

    public static void printChristmasTree1(int x)
    {
        String christmasTreeLevel = "*";
        String addLevel = "**";

        for (int i = 0; i < x; i++)
        {
            for(int j = 0; j < x - i; j++)
            {
                System.out.print(" ");
            }

            //green - main color of the tree
                String color = TEXT_GREEN;

            //yellow - for the star at the top
            if(i == 0)
                color = TEXT_YELLOW;

            System.out.println(color + christmasTreeLevel);
            christmasTreeLevel += addLevel;
        }
    }

    public static void printChristmasTree2(int x)
    {
        ArrayList<ArrayList<Character>> christmasTree = new ArrayList<>(x);

        for(int i = 0; i < x; i++)
            christmasTree.add(i, new ArrayList<Character>());

        //fill the array with stars and spaces
        for(int i = 0; i < x; i++)
        {
            int size = x + i;

            //start with spaces everywhere
            for(int j = 0; j < size; j++)
                    christmasTree.get(i).add(j, ' ');

            //add stars
            for (int k = 0; k < 2 * (i + 1) - 1; k++)
                christmasTree.get(i).set(size - k - 1, '*');

        }
     //print the array
     for(int i = 0; i < x; i++)
     {
         Random rand = new Random();
         int size = christmasTree.get(i).size();
         int ornament1 = rand.nextInt(size + 1);
         int ornament2 = rand.nextInt(size + 1);

         for(int j = 0; j < size; j++)
         {
             String color = TEXT_GREEN;

             if(i == 0)
                 color = TEXT_YELLOW;
             else if(j == ornament1 && christmasTree.get(i).get(j) == '*')
             {
                 color = TEXT_RED;
                 christmasTree.get(i).set(j, '0');
             }
             else if(j == ornament2 && christmasTree.get(i).get(j) == '*')
             {
                 color = TEXT_RESET;
                 christmasTree.get(i).set(j, '0');
             }

             System.out.print(color + christmasTree.get(i).get(j));
         }
         System.out.println();
     }
    }
}
