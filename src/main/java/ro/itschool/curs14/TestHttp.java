package ro.itschool.curs14;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ro.itschool.curs13.docs.Document;

import java.net.URISyntaxException;
import java.util.List;

public class TestHttp {
    public static void main(String[] args) throws URISyntaxException {
        ResponseEntity<List<Document>> exchange = new RestTemplate().exchange("http://10.0.0.101:8080/documents",
                HttpMethod.GET, new HttpEntity<>(null), new ParameterizedTypeReference<List<Document>>() {
                });
        List<Document> body = exchange.getBody();
        System.out.println(body);
    }
}
