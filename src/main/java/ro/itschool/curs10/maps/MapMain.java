package ro.itschool.curs10.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> mapString = new HashMap<>();
        mapString.put("host", "localhost");
        mapString.put("username", "testuser");
        mapString.put("password", "pass123");

        System.out.println(mapString);

        for (String key : mapString.keySet()) {
            System.out.println(key + "=" + mapString.get(key));
        }

        for (String value : mapString.values()) {
            System.out.println(value);
        }

        Map<String, List<String>> mapList = new HashMap<>();
        mapList.put("str. V.Alecsandri", List.of("Ionut", "Georgel", "Dinel"));
        mapList.put("str. Mihai Eminescu", List.of("Maria", "Ana", "Adrian"));

        System.out.println(mapList);
        System.out.println(mapList.get("str. V.Alecsandri"));
    }
}
