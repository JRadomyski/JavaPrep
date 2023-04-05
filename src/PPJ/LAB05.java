package PPJ;

import java.util.Scanner;

public class LAB05 {
    public static void main(String[] args) {
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
    }

    static void task02(){

/*
        int s = 0 ;
        for ( int i = 1 ; i <= 10; i++)
            s = s + i ;
            System.out.println(s);
*/

        int s = 0;
        int i = 1;
        while(i <= 10){
            s += i;
            i++;
        }
    }

    static void task03(){
        boolean czyPrawda = false;
        while(czyPrawda == true){
            System.out.println("to byla prawda (tylko while)");
        }

        do{
            System.out.println("To byla prawda (do-while)");
        }while(czyPrawda == true);
    }

    static void task04(){
        double exp;
        for(int i = 0; i < 10; i++){
            exp = 1/(Math.pow(2,i));
            System.out.println(exp);
        }
    }

    static void task05(){
        double exp;
        int wrt = 5;
        for(int i = 0; i < 10; i++){
            exp = wrt * (1/(Math.pow(2,i)));
            System.out.println(exp);
        }
    }

    static void task06(){
        for(int a = -1500; a <= 1500; a++){
            if((a % 2 == 0) && (a % 3 == 0)){
                System.out.println(a);
            }
        }
    }

    static void task07(){
        for(int i = 0; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void task08(){
        int kierunek = 0;
        Scanner scanner = new Scanner(System.in);
    }
}
