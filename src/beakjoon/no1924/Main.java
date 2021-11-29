package beakjoon.no1924;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        StringTokenizer st = new StringTokenizer(date);

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        String d = "";
        for (int i=1;i<month;i++) {
            if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
                day = day + 31;
            } else if(i==4 || i==6 || i==9 || i==11) {
                day = day + 30;
            } else if(i==2) {
                day = day + 28;
            }
        }
        if (day%7==1){
            d = "MON";
        } else if(day%7==2){
            d = "TUE";
        } else if(day%7==3){
            d = "WED";
        } else if(day%7==4){
            d = "THU";
        } else if(day%7==5){
            d = "FRI";
        } else if(day%7==6){
            d = "SAT";
        } else if(day%7==0){
            d = "SUN";
        }
        System.out.println(d);
    }
}