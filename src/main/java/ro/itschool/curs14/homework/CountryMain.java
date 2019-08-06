package ro.itschool.curs14.homework;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

public class CountryMain {
    public static void main(String[] args) throws IOException {
        ContryApi contryApi = new ContryApi();
        List<Country> countries = contryApi.getCountries()
                .stream()
//                .filter(country -> isNotEmpty(country.getName()))
//                .filter(country -> isNotEmpty(country.getCapital()))
                .filter(country -> nonNull(country.getPopulation()))
                .filter(country -> nonNull(country.getArea()))
                .collect(Collectors.toList());
        new CountryWriter("src/main/resources/countries2.txt").write(countries);
    }
}
