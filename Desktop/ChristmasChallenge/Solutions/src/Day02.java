import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
    TODO: Prepare a list of gifts.
    The program should randomly choose 3 gifts and print them on the screen.
    The gifts should not repeat.
 */
public class Day02
{
    public static void main (String[] args)
    {
        List<String> gifts = List.of(
                "Yarn", "Hook", "Polyfill", "Pattern", "Tags", "Markers", "Needles",
                "Safety eyes", "Books", "Camera"
        );

        ArrayList<Integer> numbers = new ArrayList<>();

        Random rand = new Random();

        for(int i = 0; i < 3;)
        {
            int randomNumber = rand.nextInt(10);

            if(!numbers.contains(randomNumber))
            {
                numbers.add(randomNumber);
                System.out.println(gifts.get(randomNumber));
                i++;
            }
        }
    }

}
