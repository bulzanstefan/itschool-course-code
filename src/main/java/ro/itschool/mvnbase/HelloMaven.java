package ro.itschool.mvnbase;


import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class HelloMaven {

    public static void main(String[] args) throws IOException {
        System.out.println(new HelloMaven().sayHello());
    }

    public String sayHello() throws IOException {
        return FigletFont.convertOneLine("Stefan");
    }

}
