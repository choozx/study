package beakjoon.no4153;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        ArrayList<String> pr = new ArrayList<String>();

        while (true){
            st = new StringTokenizer(sc.nextLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            int dia = z;
            if (dia < x || dia < y){
                if (x > y){
                    dia = x;
                    x = z;
                } else{
                    dia = y;
                    y = z;
                }
            }
            if (x == 0 && y == 0 && dia == 0){
                break;
            }

            boolean ans = ((y*y) + (x*x) == dia*dia);
            if (ans){
                pr.add("right");
            } else{
                pr.add("wrong");
            }
        }
        for (String s : pr) {
            System.out.println(s);
        }
    }
}