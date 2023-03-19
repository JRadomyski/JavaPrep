package Archive.metody;

public class ThePowerMethod {
    public static void main(String[] args) {
        power(2,3);
        System.out.println(summing.sumUp(3,4));
        repeat(3,"PPJ");
        isPrime(6);
        isEmail("zkaubra@gmail.com");
        isPhone("123444555");
        System.out.println(isPrivate("zkaubra@gmail.com", "503929656"));


    }

    public static void power(int a, int b){
        int c = (int)Math.pow(a,b);
        System.out.println(c);
    }

    public static void repeat(int amount, String text){
        for(int i = 1; i <= amount; i++){
            System.out.println(text);
        }
    }

    public static boolean isPrime(int liczba){
        boolean pierwsza = true;
        for(int i=2; i<liczba; i++){ //Sprawdzamy dla każdej liczby od 2 do n-1 czy n jest podzielne przez nią
            if((liczba % i == 0)){
                pierwsza = false; //Jeśli liczbę możemy podzielić przez inną liczbę niż 1 i nią samą to NIE JEST LICZBA PIERWSZA
            }
        }
        if(pierwsza)System.out.println("Liczba " + liczba + " Jest liczbą pierwszą");
        else System.out.println("Liczba " + liczba + " Nie jest liczbą pierwszą");
        return pierwsza;
    }
    public static boolean isEmail(String text){
        boolean wpp = false;
        if(text.contains("@")){
            wpp = true;
        }else{
            wpp = false;
        }
        return wpp;
    }
    public static boolean isPhone(String text){
        boolean wpp = false;
        if(text.length() == 9){
            wpp = true;
        }else{
            wpp = false;
        }
        return wpp;
    }
    public static boolean isPrivate(String text, String text2){
        boolean wpp = false;
        if(isEmail(text) || isPhone(text2)){
            wpp = true;
        }else{
            wpp = false;
        }
        return wpp;
    }


}

