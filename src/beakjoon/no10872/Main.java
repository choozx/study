package beakjoon.no10872;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int lst = Fectorial(num);
        System.out.println(lst);
    }

    public static int Fectorial(int num){

        if (num==0){
            return 1;
        } else{
            return num * Fectorial(num -1);
        }
    }
}