package PPJ;

import java.util.Scanner;

public class LAB04 {
    public static void task05(){
        int a = 1;
        int b = 2;

        if((!(a < b) && !(a > b)) == (a==b)){
            System.out.println("Wyrazenia (!(a < b) && !(a > b)) i (a==b) sa takie same");
        }else{
            System.out.println("(!(a < b) && !(a > b)) i (a==b) Nie sa takie same");
        }
    }

    public static void task06(){
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a==b ? "Te liczby sa rowne" : "To sa rozne liczby");
        System.out.println(a==c ? "Te liczby sa rowne" : "To sa rozne liczby");
    }

    public static void task07(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Prosze podac liczbe M (Miesiac)");
        int M = sc.nextInt();
        System.out.println("Prosze podac liczbe D (Dzien)");
        int D = sc.nextInt();

        if(M > 12 || D > 31){
            System.out.println("Podano bledne dane");
        }else{
            switch(M) {
                case 1:
                    System.out.println("Zima");
                    break;
                case 2:
                    if(D>29){
                        System.out.println("Podano niepoprawny dzien");
                    }else {
                        System.out.println("Zima");
                    }
                    break;
                case 3:
                    if (D < 21) {
                        System.out.println("Zima");
                    } else {
                        System.out.println("Wiosna");
                    }
                    break;
                case 4:
                case 5:
                    System.out.println("Wiosna");
                    break;
                case 6:
                    if (D < 20) {
                        System.out.println("Wiosna");
                    } else {
                        System.out.println("Lato");
                    }
                    break;
                case 7:
                case 8:
                    System.out.println("Lato");
                    break;
                case 9:
                    if (D < 22) {
                        System.out.println("Lato");
                    } else {
                        System.out.println("Jesien");
                    }
                    break;
                case 10:
                case 11:
                    System.out.println("Jesien");
                    break;
                case 12:
                    if (D < 22) {
                        System.out.println("Jesien");
                    } else {
                        System.out.println("Zima");
                    }
                    break;
            }
        }
    }

    public static void task08(){
        double a = 0.33;
        if(a >= 0){
            if(a <= 1){
                System.out.println("Podana liczba nalezy do C");
            }else{
                System.out.println("Podana liczba nalezy do A");
            }
        }else{
            System.out.println("Podana liczba nalezy do B");
        }
    }

    public static void task09(){
        int wrt = 12;
        if((-15 < wrt && wrt <= -10) || (-5 < wrt && wrt < 0) || (5 < wrt && wrt <= 10)){
            if((wrt <= -13) || (-8 < wrt && wrt <= -3)){
                if(-4 <= wrt){
                    System.out.println(wrt + " nalezy do A B i C");
                }else{
                    System.out.println(wrt + " nie nalezy do A B i C");
                }
            }else{
                System.out.println(wrt + " nie nalezy do zbiorow A B i C");
            }
        }else{
            System.out.println(wrt + " nie nalezy do zbiorow A B i C");
        }
    }

    public static void task10(){
        int wrt = 9;
        if(( (wrt > -15) && (wrt < 10)) ^ wrt <= -13){
            System.out.println("Wartosc nalezy tylko do jednego ze zbiorow A i B.");
        }else{
            System.out.println("Wartosc nie nalezy do zadnego ze zbiorow.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=====Task 05=====");
        task05();
        System.out.println("=====Task 06=====");
        task06();
        System.out.println("=====Task 07=====");
        task07();
        System.out.println("=====Task 08=====");
        task08();
        System.out.println("=====Task 09=====");
        task09();
        System.out.println("=====Task 10=====");
        task10();
    }
}
