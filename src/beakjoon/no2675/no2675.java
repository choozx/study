package beakjoon.no2675;

import java.io.*;
import java.util.StringTokenizer;

public class no2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] total = new String[num];

        for (int i =0;i<num;i++){
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int num2 = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int sLength = s.length();
            String nn = "";

            for (int j=0;j<sLength;j++) {
                for (int j2=0;j2<num2;j2++){
                    nn = nn + s.charAt(j);
                }
            }
            total[i] = nn;
        }
        for (int i =0;i<num;i++){
            System.out.println(total[i]);
        }
    }
}