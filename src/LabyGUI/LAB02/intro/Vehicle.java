package LabyGUI.LAB02.intro;

public abstract class Vehicle {

    private String name;

    public void showName(){
        System.out.println(name);
    }

    public abstract void showVehicleType();

}
