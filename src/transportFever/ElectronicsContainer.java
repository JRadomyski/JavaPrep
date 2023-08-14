package transportFever;

public class ElectronicsContainer extends Container{

    public ElectronicsContainer(int id, int weight) {
        super(id, weight, "Electronics");
    }

    public boolean requiresPower(){
        return false;
    }

    public String getSpecificRequirements(){
        return "Standard";
    }
}
