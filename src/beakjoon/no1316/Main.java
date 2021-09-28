package beakjoon.no1316;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] list = new String[num];
        int count = 0;

        for (int i = 0; i < num; i++) {
            list[i] = sc.next();
        }

        for (int i = 0; i < num; i++) {
            String s = list[i];
            xx: for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int k = j; k < s.length(); k++) {
                    if (s.charAt(k) != c) {
                        for (k=k; k < s.length(); k++) {
                            if (s.charAt(k) == c) {
                                count++;
                                break xx;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(num-count);
    }
}