package beakjoon.no11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = 2;

        while (num>1){
            if (num%a==0){
                num = num/a;
                System.out.println(a);
                a = 2;
            }else{
                a++;
            }
        }
    }
}