package transportFever;

public class BulkGoodsContainer extends Container{

    public BulkGoodsContainer(int id, int weight) {
        super(id, weight, "Sand");

    }

    @Override
    public boolean requiresPower() {
        return false;
    }

    @Override
    public String getSpecificRequirements() {
        return null;
    }
}
