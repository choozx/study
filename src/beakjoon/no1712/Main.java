package beakjoon.no1712;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        st =  new StringTokenizer(sc.nextLine());
        int first = Integer.parseInt(st.nextToken());
        int makeCost = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int benefit = price-makeCost;
        int count = 1;

        if (benefit<=0){
            System.out.println("-1");
        } else{
            while ((benefit*count)-first<=0){
                count++;
            }
            System.out.println(count);
        }
    }
}
