package transportFever;

import java.io.IOException;
import java.util.Random;

public class Main {
    private static final Random random = new Random();

    private static Container generateRandomContainer(int id) {
        int weight = 1000 + random.nextInt(3000);
        int type = random.nextInt(3);

        return switch (type) {
            case 0 -> new BananaContainer(id, weight);
            case 1 -> new ElectronicsContainer(id, weight);
            default -> new BananaContainer(id, weight);
        };
    }

    public static void main(String[] args) {
        Ship ship = new Ship();

        for (int i = 0; i < 1500; i++) {
            Container container = generateRandomContainer(i+1);
            ship.loadContainer(container);
        }

        try {
            ship.arrangeContainers();
            ship.saveManifestToFile("./data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
