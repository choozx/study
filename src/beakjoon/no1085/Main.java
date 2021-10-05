package beakjoon.no1085;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int minx = 0;
        int miny = 0;

        if (w-x>x){
            minx = x;
        } else {
            minx = w-x;
        }

        if (h-y>y){
            miny = y;
        } else {
            miny = h-y;
        }

        if (minx>miny){
            System.out.println(miny);
        }else{
            System.out.println(minx);
        }
    }
}
