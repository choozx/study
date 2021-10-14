package beakjoon.no2798;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc.nextLine());
        StringTokenizer st2 = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int max =0;
        int[] card = new int[n];

        for (int i=0;i<n;i++){
            card[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i=0;i<n-2;i++){
            for (int j=i+1;j<n-1;j++){
                for (int k=j+1;k<n;k++){
                    int mid = card[i] + card[j] + card[k];
                    if (mid > max && mid <= m){
                        max = mid;
                    }
                }
            }
        }
        System.out.println(max);
    }
}