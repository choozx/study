package beakjoon.no1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count;
        int total=0;
        int dir=0;

        while (num-total>0){
            total = total + dir;
            dir++;
        }
        int rpos = total-num + 1;

        if (dir%2==1){
            System.out.printf("%d/%d", dir-rpos, rpos);
        }else if(dir%2==0){
            System.out.printf("%d/%d", rpos, dir-rpos);
        }
    }
}