package beakjoon.no10870;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = fib(sc.nextInt());
        System.out.println(ans);
    }
    public static int fib(int num){

        if (num==1){
            return 1;
        }else if(num==0){
            return 0;
        } else {
            return fib(num-1) + fib(num-2);
        }
    }
}