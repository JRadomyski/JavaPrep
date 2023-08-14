package transportFever;

import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Ship {
    private final ArrayList<Container> containers = new ArrayList<>();

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

    public void arrangeContainers() {
        containers.sort(Comparator.comparingInt(Container::getWeight));
    }

    public void saveManifestToFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();

        for(Container container : containers) {
            String line = container.getId() + "\t" + container.getWeight() + "\t" + container.getType();
            lines.add(line);
        }

        Files.write(Paths.get(filePath), lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}