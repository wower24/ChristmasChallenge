/*
TODO: Santa Claus has to visit 3 cities with coordinates (1, 1), (4, 5), (11, 5) in that order.
    For 10 distance units his sleighs uses 20 liters of gasoline.
    How much gasoline does he need for the whole route?
    Print the result.
 */

import static java.lang.Math.*;

public class Solution {

    public static void main(String[] args)
    {
        double city1x = 1;
        double city1y = 1;
        double city2x = 4;
        double city2y = 5;
        double city3x = 11;
        double city3y = 5;

        double distanceC1C2 = calculateDistance(city1x, city1y, city2x, city2y);
        double distanceC2C3 = calculateDistance(city2x, city2y, city3x, city3y);

        double result = (distanceC1C2 + distanceC2C3)*2;

        System.out.println("Santa Claus needs " + result + " liters of gasoline.");
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2)
    {
        double distance = 0;

        if(x1 == x2)
            distance = abs(y2 - y1);
        else if(y1 == y2)
            distance = abs(x2 - x1);
        else
            distance = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

        return distance;
    }
}
