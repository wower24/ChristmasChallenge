/*
    TODO: Count vowels in addresses.
    Multiply result by 2 and print in on the screen.
 */

import java.util.ArrayList;
import java.util.List;

public class Day09 {
    public static void main(String[] args) {
        List<Address> addresses = prepareAddresses();

        int counter = 0;

        for (Address a : addresses) {
            String addressText = (a.getCity() + a.getStreet() + a.getHouseNumber()).toLowerCase();

            for (Character c : addressText.toCharArray()) {
                if (c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u') || c.equals('y'))
                    counter++;
            }

        }

        System.out.println("Price to pay: " + 2 * counter);
    }

    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289A",
                55,
                "Gdansk",
                "02-326"
        ));
        addresses.add(new Address("Barszczykowa",
                "234",
                5,
                "Rzeszow",
                "37-326"
        ));
        addresses.add(new Address("Uszkowa",
                "43H",
                5,
                "Wroclaw",
                "02-326"
        ));
        addresses.add(new Address("Cukierkowa",
                "23I",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}
