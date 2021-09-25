package beakjoon.no2908;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String newA = "";
        String newB = "";

        for (int i=2;i>=0;i--){
            newA = newA + a.charAt(i);
            newB = newB + b.charAt(i);
        }

        if (Integer.parseInt(newA) > Integer.parseInt(newB)){
            System.out.println(newA);
        } else{
            System.out.println(newB);
        }
    }
}