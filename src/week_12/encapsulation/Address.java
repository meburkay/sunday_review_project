package week_12.encapsulation;

import java.lang.management.OperatingSystemMXBean;

public class Address {
    /*

Task 1: AdressTask

	Create a class named Address

			Private variables:
					street, city, zipCode,country

			encapsulate all the fields

			add a constructor that can set all the instances
				  overload constr with no arg constr

			- if the street name isEmpty or street length is bigger than 50
			 otherwise
				 ERROR : Invalid Street

		    - ZipCode length should be equal 5 otherwise
		    	 ERROR :Invalid ZipCode

			DO NOT duplicate any code fragments
     */
    private String street;
    private String city;
    private int zipcode;
    private String country;

    public Address(String street, String city, int zipcode, String country) {
        setStreet(street);
        this.city = city;
        setZipcode(zipcode);
        this.country = country;
    }

    public void setZipcode(int zipcode) {
        //from 10000 99999
        //  if (zipcode>=10000&& zipcode<=99999)
        if ((zipcode + "").length() == 5) {
            this.zipcode = zipcode;
        } else {
            System.out.println("you ca not use zipcode length other that 5");
            System.exit(0);
        }
    }

    public void setStreet(String street) {
        //if the street name isEmpty or street length is bigger than 50
        if (street.isBlank() || street.length() > 50) {
            if (street.isBlank()) {
                System.out.println("You ca no use empty street name");
            } else {
                System.out.println("You can not use street length bigger than 50");
            }
            System.exit(0);
        } else {
            this.street = street;
        }
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                ", country='" + country + '\'' +
                '}';
    }
}
