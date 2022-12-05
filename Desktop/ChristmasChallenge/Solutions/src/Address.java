/*
    Address class for Day 05 of Christmas challenge
 */

public class Address {
    private String street, houseNumber, city, zipcode;
    private int flatNumber;

    public Address(String s, String hN, int fN, String c, String z)
    {
        this.street = s;
        this.houseNumber = hN;
        this.flatNumber = fN;
        this.city = c;
        this.zipcode = z;
    }

    public String getStreet()
    {
        return this.street;
    }

    public String getHouseNumber()
    {
        return this.houseNumber;
    }

    public int getFlatNumber()
    {
        return this.flatNumber;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getZipcode()
    {
        return this.zipcode;
    }

    @Override
    public String toString()
    {
        String fullAddress = this.street + " " + this.houseNumber + "/" + this.flatNumber + "\n"
                + this.zipcode + " " + this.city;

        return fullAddress;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null)
            return false;

        if(this == o)
            return true;

        Address a = (Address) o;
        return this.zipcode == a.zipcode && this.city == a.city && this.flatNumber == a.flatNumber
                && this.houseNumber == a.houseNumber && this.street == a.street;
    }
}
