package beakjoon.no2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        int room = 1;
        
        if (a==1){
            System.out.println("1");
        } else {
            while (a-room>0){
                room = room + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}