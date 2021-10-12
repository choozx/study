package beakjoon.no3053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        double cur = Math.PI*in*in;
        double taxi = 2.0*in*in;

        System.out.printf("%f\n", cur);
        System.out.printf("%f",taxi);
    }
}