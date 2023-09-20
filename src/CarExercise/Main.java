package CarExercise;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevy", "Camaro", 2011, "yellow", 300);
        Car car1 = new Car("Ford", "Bronco", "Black", 200);
        System.out.println(car.toString());
        System.out.println(car1.toString());
    }
}
