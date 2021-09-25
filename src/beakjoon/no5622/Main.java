package beakjoon.no5622;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int time = 0;
        int[] list = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        for (int i=0;i<s.length();i++) {
            for (int j=0;j<26;j++){
                if (j+65==s.charAt(i)){
                    time = time + list[j];
                }
            }
        }
        System.out.println(time);
    }
}