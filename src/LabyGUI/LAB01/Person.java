package LabyGUI.LAB01;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Person person){
        System.out.println("Hi " + person.name + "!");
    }

    @Override
    public String toString() {
        return name;
    }
}
