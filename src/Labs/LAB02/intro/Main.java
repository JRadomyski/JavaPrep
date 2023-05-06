package Labs.LAB02.intro;
public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
//        Vehicle vehicle = new Vehicle();

        Vehicle motorcycle = new Vehicle() {
            @Override
            public void showVehicleType() {
                System.out.println("Type: Motorcycle");
            }
        };

        car.showVehicleType();
        motorcycle.showVehicleType();

    }

}
