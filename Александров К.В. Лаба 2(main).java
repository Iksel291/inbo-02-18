package com.company;
import java.util.Scanner;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Whrite the autor's surname, book's name and year of publication: ");
        String autor = in.nextLine();
        String book = in.nextLine();
        int year = in.nextInt();

        Book A = new Book(autor, book, year);
        System.out.println("\n" + A.getBoo() + "\n" + A.getSur() + "\n" + A.getYear());
        in.close();
    }
}
