package ro.itschool.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class HelloMavenTest {

    @Test
    @DisplayName("WHEN we call sayHello THEN an ascii art is returned")
    void sayHelloShouldReturnAscii() throws IOException {
        //setup
        HelloMaven helloMaven = new HelloMaven();

        //run
        String result = helloMaven.sayHello();

        //assert
        Assertions.assertTrue(result.contains("|"));
    }
}