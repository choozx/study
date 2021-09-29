package beakjoon.no11720;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] numList = new int[sc.nextInt()];
        String num = sc.next();
        int total = 0;

        for (int i=0;i< numList.length;i++){
            numList[i] = Character.getNumericValue(num.charAt(i));
        }

        for (int i=0;i<numList.length;i++){
            total = total + numList[i];
        }
        System.out.println(total);
    }
}