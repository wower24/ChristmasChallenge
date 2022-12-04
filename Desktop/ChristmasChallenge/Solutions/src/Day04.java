/*
    TODO: Print a list of gifts converted to binary letter by letter.
 */

import java.util.List;

import static java.lang.Integer.toBinaryString;

public class Day04
{
    public static void main (String[] args)
    {
        List<String> gifts = List.of(
                "Yarn", "Hook", "Polyfill", "Pattern", "Tags", "Markers", "Needles",
                "Safety eyes", "Books", "Camera"
        );

        for (String gift : gifts)
        {
            for (int j = 0; j < gift.length(); j++)
            {
                System.out.print(toBinaryString((int) gift.charAt(j)) + " ");
            }

            System.out.println();
        }
    }
}
