package PPJ;

import java.util.Scanner;

public class LAB04 {
    public static void task01(){
        int i = 10;
        System.out.println(i);
        i = i++;
        System.out.println(i);
        i = ++i;
        i = i++ + ++i;
        System.out.println(i);
    }

    public static void task02(){
//        double a = ...;
//        double x;
//        if (a >= 0) x = 1.701;
//        if (a < 0) x = 2D*3.14f;
//        System.out.println(x);
// niepoprawna deklaracja a oraz niezadeklarowanie x
    }

    public static void task03(){
        //No, I am here!
        //No, actually, I am here!
        int zmInt = 4;
        double zmDouble = -1.0;
        if(zmInt > 0)
            if(zmDouble > 0)
                System.out.println("Here I am!");
        else
                System.out.println("No, I am here!");
        System.out.println("No, actually, I am here!");
    }

    public static void task04(){

    }

    public static void task05(){
        int a = 1;
        int b = 2;

        if((!(a < b) && !(a > b)) == (a==b)){
            System.out.println("Wyrazenia sa takie same");
        }else{
            System.out.println("Nie sa takie same");
        }
    }

    public static void task06(){
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println(a==b ? "" : "");
        System.out.println(a==c ? "" : "");
    }

    public static void task07(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Prosze podac liczbe M (Miesiac)");
        int M = sc.nextInt();
        System.out.println("Prosze podac liczbe D (Dzien)");
        int D = sc.nextInt();



    }

    public static void task08(){
        double a = 0.33;
        if (a >= 0){
            if (a <= 1){
                System.out.println("Podana liczba należy do przedziału C");
            }else{
                System.out.println("Podana liczba należy do przedziału A");
            }
        }else {
            System.out.println("Podana liczba należy do przedziału B");
        }
    }

//    public static void task09(){
//        int wrt = 12;
//        if ((-15 < wrt && wrt <= -10) || (-5 < wrt && wrt < 0) || (5 < wrt && wrt <= 10)) {
//            if((wrt <= -13) || (-8 < wrt && wrt <= -3)){
//                if(-4 <= wrt){
//                    System.out.println(wrt + " należy do części wspólnej zbiorów A, B i C.");
//                }else{
//                    System.out.println(wrt + " nie należy do części wspólnej zbiorów A, B i C.");
//                }
//            }else{
//                System.out.println(wrt + " nie należy do części wspólnej zbiorów A, B i C.");
//            }
//        }else{
//            System.out.println("Liczba " + wrt + " nie należy do części wspólnej zbiorów A, B i C.");
//        }
//        }
//    }

    public static void task10(){
        int wrt = 9;
        if(( (wrt > -15) && (wrt < 10)) ^ wrt <= -13){
            System.out.println("Zmienna należy wyłącznie do jednego ze zbiorów A i B.");
        } else{
            System.out.println("Zmienna nie należy do żadnego ze zbiorów.");
        }
    }

    public static void main(String[] args) {
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();

        task10();
    }
}
