package BitwiseCalculator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runtime = true;
        int result = 0;

        System.out.println("Prosze wprowadzic pierwsza liczbe: ");
        int num1 = scanner.nextInt();
        System.out.println("Prosze wprowadzic druga liczbe: ");
        int num2 = scanner.nextInt();

        System.out.println("+ -> dodawanie");
        System.out.println("- -> odejmowanie");
        System.out.println("* -> mnozenie");
        System.out.println("/ -> dzielenie");
        System.out.println("Prosze wprowadzic znak operacji: ");
        char operation = scanner.next().charAt(0);

        System.out.println(num1);
        for(int i = 15; i >=0; i--){
            if((num1 & 0b1 << i) != 0b0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();

        System.out.println(num2);
        for(int i = 15; i >=0; i--){
            if((num2 & 0b1 << i) != 0b0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }

        while(runtime){
            if(operation == '+'){
                while(num2 != 0){
                    int temp = num1 & num2;
                    num1 = num1 ^ num2;
                    num2 = temp << 1;
                }
                result = num1;
                runtime = false;
            }else if(operation == '-'){
                while(num2 != 0){
                    int temp = ~num1 & num2;
                    num1 = num1 ^ num2;
                    num2 = temp << 1;
                }
                result = num1;
                runtime = false;
            }else if(operation == '*'){
                while(num2 !=0){
                    if(num2 % 2 == 1){
                        result = result + num1;
                    }
                    num1 = num1 << 1;
                    num2 = num2 >> 1;
                }
                runtime = false;
            }else if(operation == '/'){
                if(num2 == 0){
                    System.out.println("Prosze nie dzielic przez 0");
                    runtime = false;
                }else if(num1 == 0 || num1 < num2){
                    result = 0;
                    runtime = false;
                }else{
                    int r = 0;
                    int counter = 0;

                    while((num1 & (1 << counter)) == 0){
                        counter++;
                    }
                    while((num1>>counter) >= num2){
                        int t = num1 - (num2 << counter);
                        if(t >=0){
                            r |= 1 << counter;
                            num1 = t;
                        }
                        counter--;
                    }
                    result = r;
                    runtime = false;
                }
            }else if(num1 == 0 && num2 == 0){
                System.out.println("Podane liczby sa zerami!");
                runtime = false;
            }else{
                System.out.println("Blad!");
                runtime = false;
            }
        }

        System.out.println();
        System.out.println("Wynik: ");

        for(int i = 15; i >=0; i--){
            if((result & 0b1 << i) != 0b0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println(" ---> " + result);
    }
}

