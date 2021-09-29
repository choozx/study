package beakjoon.no10250;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        for (int i=0;i<num;i++){
            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken());

            String floor;
            if (room%y==0){
                floor = String.valueOf(y);
            } else{
                floor = String.valueOf(room%y);
            }

            String rn;
            if (room%y==0){
                if (room/y<10){
                    rn = "0" + (room / y);
                } else {
                    rn = String.valueOf(room/y);
                }
            }else{
                if (room/y+1<10){
                    rn = "0" + (room / y + 1);
                }else{
                    rn = String.valueOf(room/y+1);
                }
            }

            bw.write(floor+rn + "\n");
        }
        bw.close();
    }
}