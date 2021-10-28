package beakjoon.no2750;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        int[] num = new int[cycle];
        int[] output = new int[cycle];
        for (int i = 0; i <cycle;i++){
            num[i] = sc.nextInt();
        }

        for (int i = cycle;i>0;i--){
            for (int j = 0;j<cycle-1;j++){
                if (num[j] > num[j+1]){
                    int tmp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for (int i = 0;i<cycle;i++){
            System.out.println(num[i]);
        }
    }
}
