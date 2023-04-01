package LabyGUI.LAB02.z1;

public abstract class Spiewak {

    private String name;
    private int startNumber;
    private static int counter = 1;

    public Spiewak(String name) {
        this.name = name;
        startNumber = counter++;
    }

    public abstract String spiewaj();

    public static Spiewak najglosniej(Spiewak[] spiewacy){
        Spiewak result = null;
        int max = -1;

        for (Spiewak s : spiewacy) {
            int tmp = s.spiewaj().replaceAll("[^A-Z]", "").length();
            if (tmp > max){
                max = tmp;
                result = s;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "(" + startNumber +") " + name + ": " + spiewaj();
    }
}
