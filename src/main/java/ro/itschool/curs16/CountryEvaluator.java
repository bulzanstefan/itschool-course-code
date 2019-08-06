package ro.itschool.curs16;

import ro.itschool.curs14.homework.Country;

public class CountryEvaluator {
    public String evaluate(Country country) throws BadCountryException {
        if (country.getName().equals("Germany")) {
            throw new BadCountryException(country);
        }
        return "You're good";
    }
}
