package beakjoon.no2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1;i<=1000000;i++){
            int tem = i;
            int ans = i;
            while (tem/10!=0){
                ans = ans + tem%10;
                tem = tem/10;
            }
            ans = ans + tem;
            if (ans==num){
                System.out.println(i);
                break;
            }
            if (i==1000000 && ans!=num){
                System.out.println(0);
            }
        }
    }
}