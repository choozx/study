package beakjoon.no2440;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        for (int i = cycle;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}