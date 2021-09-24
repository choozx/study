package beakjoon.no1065;

import java.util.Scanner;

public class Main {

    public static int getNum(int num) {
        int result = 0;
        for (int i = 1; i < num+1; i++) {
            int[] setnum = new int[3];
            int a = i;

            for (int j = 0; j < 3; j++) {
                setnum[j] = a % 10;
                a = a/10;
            }

            if(i<100){
                result++;
            }else if(i==1000){

            }
            else{
                if ((setnum[1] - setnum[0]) == (setnum[2] - setnum[1])) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getNum(sc.nextInt()));
    }
}
