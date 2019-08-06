package ro.itschool.curs14.homework;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.http.HttpMethod.GET;

public class ContryApi {
    public List<Country> getCountries() {
        return new RestTemplate().exchange(
                "https://restcountries.eu/rest/v2/all",
                GET,
                new HttpEntity<>(null),
                new ParameterizedTypeReference<List<Country>>() {
                }).getBody();
    }
}
