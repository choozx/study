package beakjoon.no2581;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pn = new ArrayList<Integer>();
        int min = sc.nextInt();
        int max = sc.nextInt();

        for (int i=min;i<=max;i++){
            if (i==1){
                continue;
            } else {
                int jg = 0;
                for (int j = 2;j<i;j++){
                    if (i%j==0){
                        jg++;
                    }
                }
                if (jg==0){
                    pn.add(i);
                }
            }
        }
        if (pn.isEmpty()){
            System.out.println("-1");
        }else{
            int low = 10000;
            int sum = 0;
            for (int i=0;i<pn.size();i++){
                sum = sum + pn.get(i);
                if (pn.get(i)<low){
                    low = pn.get(i);
                }
            }
            System.out.println(sum);
            System.out.println(low);
        }
    }
}
