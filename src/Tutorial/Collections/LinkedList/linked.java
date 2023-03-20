package Tutorial.Collections.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Adam");
        String p1 = "Ola";
        list.add(p1);
        list.addFirst("Rafal");
        list.removeFirstOccurrence(p1);
        list.addFirst("Julek");
        list.addLast("Rafal");


        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();
        ListIterator<String> iterator2 = list.listIterator(list.size());
        while(iterator2.hasPrevious()){
            String str = iterator2.previous();
            System.out.println(str);
        }

    }
}
