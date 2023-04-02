package LabyGUI.LAB04.ZAD02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                " office A", " John ", "Doe ",
                " office B", " John ", " Brown ",
                " office C", " Mary ", " Jones ",
                " office B", " Adam ", " Rust ",
                " office C", " Cindy ", " Frost ",
                " office A", " Kate ", "Coe ",
                " office A", " Bill ", " Brown "
        };

        Map<String, List<Person>> companyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i += 3) {
            String companyName = arr[i].trim();
            String firstName = arr[i + 1].trim();
            String lastName = arr[i + 2].trim();
            Person person = new Person(firstName, lastName);
            companyMap.putIfAbsent(companyName, new ArrayList<>());
            companyMap.get(companyName).add(person);
        }

        // Wyświetlenie zawartości mapy
        for (Map.Entry<String, List<Person>> entry : companyMap.entrySet()) {
            String companyName = entry.getKey();
            List<Person> employees = entry.getValue();
            System.out.println(companyName + " = " + employees);
        }

        // Wyświetlenie firmy z największą liczbą pracowników
        int maxEmployees = 0;
        String maxCompanyName = "";
        for (Map.Entry<String, List<Person>> entry : companyMap.entrySet()) {
            String companyName = entry.getKey();
            List<Person> employees = entry.getValue();
            if (employees.size() > maxEmployees) {
                maxEmployees = employees.size();
                maxCompanyName = companyName;
            }
        }
        System.out.println(maxCompanyName + " : " + maxEmployees + " users");
    }
}
