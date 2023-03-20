package Tutorial;

import Tutorial.Collections.ArrayList.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> groceryList = new ArrayList<Product>();
        groceryList.add(new Product("Gruszka"));
        groceryList.add(new Product("Jablko"));
        groceryList.add(new Product("Pomarancza"));
        groceryList.add(new Product("Awokado"));
        groceryList.add(new Product("Pietruszka"));

        Iterator<Product> iterator = groceryList.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            System.out.println(product);
        }

    }
}
