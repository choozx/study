package beakjoon.no2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suger = sc.nextInt();
        int five = 0;
        int three = 0;

        if (suger%5==0){
            System.out.println(suger/5);
        } else {
            five = suger / 5+1;
            while (five>=0){
                if (5*five+3*three==suger){
                    System.out.println(five+three);
                    System.exit(0);
                } else{
                    five--;
                    three = (suger - 5*five)/3;
                }
            }
            System.out.println("-1");
        }

    }
}