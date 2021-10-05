package beakjoon.no9020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        boolean[] pn = new boolean[10001];
        Arrays.fill(pn, true);
        pn[1] = false;

        for (int i = 1; i < pn.length; i++) {
            if (pn[i] == true) {
                for (int j = 2; j * i < pn.length; j++) {
                    pn[i * j] = false;
                }
            }
        }

        for (int i=0;i<cycle;i++){
            list.add(sc.nextInt());
        }

        int[][] ans = new int[2][cycle];

        for (int i=0;i<cycle;i++){
            int num = list.get(i);
            int down = num/2;
            int up = num/2;

            while (true){
                if (pn[up] && pn[down]){
                    ans[0][i] = down;
                    ans[1][i] = up;
                    break;
                } else {
                    down = down - 1;
                    up = up + 1;
                }
            }
        }
        for (int i=0;i<cycle;i++){
            System.out.println(ans[0][i] + " " + ans[1][i]);
        }
    }
}