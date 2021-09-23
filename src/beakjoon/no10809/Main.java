package beakjoon.no10809;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] ar = new int[26];
        String s = sc.next();

        for (int i = 0; i < ar.length; i++){
            ar[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 27; j++) {
                if (j + 97 == (int) s.charAt(i)) {
                    if (ar[j] != -1) {
                        break;
                    } else {
                        ar[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i < ar.length; i++){
            System.out.printf("%d ",ar[i]);
        }
    }
}