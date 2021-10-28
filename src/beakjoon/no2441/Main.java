package beakjoon.no2441;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        for (int i = 0;i<cycle;i++){
            for (int j = 0;j<cycle;j++){
                if (i > j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
