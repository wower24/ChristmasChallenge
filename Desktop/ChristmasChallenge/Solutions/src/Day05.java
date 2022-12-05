/*
    TODO: Sort a list of addresses by cities.
    Try to do it in one line of code.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day05 {
    public static void main (String[] args)
    {
        List<Address> addresses = prepareAddresses();

        addresses.stream().sorted(Comparator.comparing(Address::getCity)).forEach(System.out::println);
    }

    //method copied from wswieciekodu
    private static List<Address> prepareAddresses() {
        List<Address> addresses = new ArrayList<>();

        addresses.add(new Address("Swiateczna",
                "234",
                5,
                "Warszawa",
                "02-326"));
        addresses.add(new Address("Choinkowa",
                "34A",
                1,
                "Krakow",
                "31-326"
        ));
        addresses.add(new Address("Mikolaja Swietego",
                "87",
                3,
                "Rzeszow",
                "40-326"
        ));
        addresses.add(new Address("Bombkowa",
                "214",
                55,
                "Gdansk",
                "15-326"
        ));
        addresses.add(new Address("Prezentowa",
                "543",
                765,
                "Warszawa",
                "02-326"
        ));
        addresses.add(new Address("Serniczkowa",
                "4B",
                2,
                "Krakow",
                "02-326"
        ));
        addresses.add(new Address("Pierniczkowa",
                "289",
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
                "23",
                5,
                "Poznan",
                "02-326"
        ));

        return addresses;
    }
}
