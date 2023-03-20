package Tutorial.Collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStuff {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(56);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(23);

        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
