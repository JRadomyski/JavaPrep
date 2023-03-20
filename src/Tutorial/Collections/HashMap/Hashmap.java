package Tutorial.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Poland", "Warsaw");
        countriesAndCapitals.put("France", "Paris");
        countriesAndCapitals.put("USA", "Washington DC");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("Amsterdam", "Netherlands");

        System.out.println(countriesAndCapitals.get("Poland"));

        countriesAndCapitals.get("Italy");
        countriesAndCapitals.getOrDefault(
                "Italy",
                "Capital for this country is not defined"
        );
        System.out.println("-----Klucze-----");
        countriesAndCapitals.keySet().forEach(System.out::println);
        System.out.println("-----Wartosci-----");
        countriesAndCapitals.values().forEach(System.out::println);



    }
}
