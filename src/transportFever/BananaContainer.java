package transportFever;

public class BananaContainer extends Container{
    public BananaContainer(int id, int masa) {
        super(id, masa, "Banana");
    }

    public boolean requiresPower(){
        return true;
    }

    public String getSpecificRequirements(){
        return "Nitrogen cooling system";
    }
}
