package ro.itschool.curs16;

import ro.itschool.curs14.homework.Country;

public class CountryEvaluatorMain {
    public static void main(String[] args) throws BadCountryException {
        CountryEvaluator countryEvaluator = new CountryEvaluator();
        try {
            System.out.println(countryEvaluator.evaluate(new Country("Germany")));
        } catch (BadCountryException bce) {
            System.out.println("The country that is bad is " + bce.getCountry());
        }

        System.out.println(countryEvaluator.evaluate(new Country("Belgium")));
    }
}
