package transportFever;

public abstract class Container {
    private int id;
    private int masa;
    private String type;

    public Container(int id, int masa, String type) {
        this.id = id;
        this.masa = masa;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getMasa() {
        return masa;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public void setType(String type) {
        this.type = type;
    }
}
