package LabyGUI.LAB03.intro;

public class Main {

    public static void main(String[] args) {

        Show myClass = new MyClass();

        myClass.showHelloWithText("Joanna");

        Show show = new Show() {
            @Override
            public void showHelloWithText(String text) {
                System.out.println("Hi " + text);
            }
        };

        show.showHelloWithText("Joanna");

//        intro.Show show2 = (String text) -> {
//                System.out.println("Hi " + text);
//            };

        Show show2 = text -> System.out.println("Hi " + text);

        show2.showHelloWithText("Joanna");


    }

}
