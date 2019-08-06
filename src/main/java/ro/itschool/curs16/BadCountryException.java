package ro.itschool.curs16;

import ro.itschool.curs14.homework.Country;

public class BadCountryException extends Exception {
    private final Country country;

    public BadCountryException(Country country) {
        super("The country " + country.getName() + " is bad");
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
