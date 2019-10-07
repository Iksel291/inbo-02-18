package com.company;
import java.util.Scanner;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Whrite n: ");
        float num = in.nextFloat();
        float [] sum = new float [10];
        for(int i = 0; i < 10; i++)
        {
            sum[i] = 1 / num;
            num = num + 1;
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println(sum[i]);
        }
    }
}
