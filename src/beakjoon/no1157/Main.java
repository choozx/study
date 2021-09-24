package beakjoon.no1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[26];

        String s = sc.next();
        for (int i=0;i<s.length();i++){
            for (int j=0;j<26;j++){
                int cNum = Character.getNumericValue(s.charAt(i));
                if ((j+10)==cNum) {
                    list[j] = list[j] + 1;
                }
            }
        }

        int max = list[0];
        for (int i=0;i<26;i++){
            if (max < list[i]){
                max = list[i];
            }
        }
        int count = 0;
        for (int i=0;i<26;i++){
            if (max==list[i]){
                count++;
                if(count==2){
                    System.out.println("?");
                    System.exit(0);
                }
            }
        }
        for (int i=0;i<26;i++){
            if (max==list[i]){
                System.out.println((char)(i+65));
            }
        }
    }
}