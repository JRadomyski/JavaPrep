package transportFever;
import java.util.ArrayList;

public class Ship {
    private ArrayList<Container> containers = new ArrayList<>();

    public void loadContainer(Container container) {
        containers.add(container);
    }

    public void unloadContainer(Container container) {
        containers.remove(container);
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Container container : containers) {
            totalWeight += container.getWeight();
        }
        return totalWeight;
    }
}