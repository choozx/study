package beakjoon.no1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cycle = Integer.parseInt(br.readLine());
        String insert = br.readLine();
        int count = 0;
        StringTokenizer st = new StringTokenizer(insert);

        for (int i=0;i<cycle;i++){
            int num = Integer.parseInt(st.nextToken());
            if (num==1){
                count++;
                continue;
            } else {
                for (int j = 2;j<num;j++){
                    if (num%j==0){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(cycle-count);
    }
}