package ro.itschool.curs14.reader;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ro.itschool.curs13.docs.DocSource;
import ro.itschool.curs13.docs.Document;

import java.util.List;

public class RestDocSource implements DocSource {
    @Override
    public List<Document> getDocuments() {
        ResponseEntity<List<Document>> exchange = new RestTemplate()
                .exchange("http://10.0.0.101:8080/documents",
                        HttpMethod.GET,
                        new HttpEntity<>(null),
                        new ParameterizedTypeReference<List<Document>>() {
                        });
        return exchange.getBody();
    }
}
