package streams;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream("myfile.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        PrintWriter pw = new PrintWriter(fos);
//        pw.println("I love javav2");
//        pw.close();

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("myfile.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner in = new Scanner(fis);

        while(in.hasNext()){
            System.out.println(in.nextLine());
        }


    }

}
