package transportFever;

public abstract class Container {
    private int id;
    private int weight;
    private String type;

    public Container(int id, int weight, String type) {
        this.id = id;
        this.weight = weight;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract boolean requiresPower();

    public abstract String getSpecificRequirements();
}
