package LabyGUI.LAB03.intro;

@FunctionalInterface
public interface Show {

    int a = 5;

    default void showText(String text){
        System.out.println(text);
    }

    void showHelloWithText(String text);

}
