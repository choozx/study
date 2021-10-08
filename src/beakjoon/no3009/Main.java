package beakjoon.no3009;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dot = new int[2][3];
        int x, y;

        for (int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            dot[0][i] = Integer.parseInt(st.nextToken());
            dot[1][i] = Integer.parseInt(st.nextToken());
        }
        if (dot[0][0]==dot[0][1]){
            x = dot[0][2];
        }else if (dot[0][0]==dot[0][2]){
            x = dot [0][1];
        }else{
            x = dot[0][0];
        }
        if (dot[1][0]==dot[1][1]){
            y = dot[1][2];
        }else if (dot[1][0]==dot[1][2]){
            y = dot [1][1];
        }else{
            y = dot[1][0];
        }

        System.out.println(x + " " + y);
    }
}