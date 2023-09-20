package Basics;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String name1 = "Mariusz";
        String name2 = "Dominik";
        String name3 = "Agata";
        String name4 = "Daniel";

        ArrayList<String> guests = new ArrayList<>();
        guests.add(name1);
        guests.add(name2);
        guests.add(name3);
        guests.remove(name1);

        for(String guest : guests) {
            System.out.println(guest);
        }
    }
}
