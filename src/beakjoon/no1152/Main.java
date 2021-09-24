package beakjoon.no1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreElements()){
            st.nextToken();
            count++;
        }
        System.out.println(count);
    }
}