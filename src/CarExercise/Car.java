package CarExercise;

public class Car {

    private final String make;
    private final String model;
    private final int year;
    private String color;
    private int mileage;
    private final int maxSpeed;
    private int range;

    
    public Car(String make, String model, int year, String color, int maxSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String make, String model, String color, int maxSpeed) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.year = 2023;
    }

    public void drive(int distance) {
        mileage += distance;
        range -= distance;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
