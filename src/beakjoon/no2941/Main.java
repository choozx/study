package beakjoon.no2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i==s.length()-2){
                if (s.charAt(i)=='d' && s.charAt(i+1)=='z'){
                    count = count +2;
                    break;
                }
            }
            if (i==s.length()-1){
                if (s.charAt(i)=='c' || s.charAt(i)=='l' || s.charAt(i)=='n' || s.charAt(i)=='s' || s.charAt(i)=='z' || s.charAt(i)=='d'){
                    count++;
                    break;
                }
            }
            if (s.charAt(i) == 'c') {
                if (s.charAt(i + 1) == '=') {
                    count++;
                    i = i + 1;
                } else if (s.charAt(i + 1) == '-') {
                    count++;
                    i = i + 1;
                } else {
                    count++;
                }
            }
            else if (s.charAt(i) == 'd') {
                if (s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                    count++;
                    i = i + 2;
                } else if (s.charAt(i + 1) == '-') {
                    count++;
                    i = i + 1;
                } else {
                    count++;
                }
            }
            else if (s.charAt(i) == 'l') {
                if (s.charAt(i + 1) == 'j') {
                    count++;
                    i = i + 1;
                } else {
                    count++;
                }
            }
            else if (s.charAt(i) == 'n') {
                if (s.charAt(i + 1) == 'j') {
                    count++;
                    i = i + 1;
                } else {
                    count++;
                }
            }
            else if (s.charAt(i) == 's') {
                if (s.charAt(i + 1) == '=') {
                    count++;
                    i = i + 1;
                } else {
                    count++;
                }
            }
            else if (s.charAt(i) == 'z') {
                if (s.charAt(i + 1) == '=') {
                    count++;
                    i = i + 1;
                } else {
                    count++;
                }
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}