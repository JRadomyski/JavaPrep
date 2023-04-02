package LabyGUI.LAB02.z2;

public class Main {
    public static void main(String[] args) {
        FiguraGeometryczna[] figury = new FiguraGeometryczna[3];
        figury[0] = new Kwadrat("czerwony", 4);
        figury[1] = new Prostokat("zielony", 3, 5);
        figury[2] = new Kolo("niebieski", 2);
        System.out.println(figury[0].toString());
        System.out.println(figury[1].toString());
        System.out.println(figury[2].toString());
    }
}
