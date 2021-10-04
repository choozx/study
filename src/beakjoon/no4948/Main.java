package beakjoon.no4948;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean[] list = new boolean[246913];
        Arrays.fill(list, true);
        list[1] = false;

        for (int i = 1; i < list.length; i++) {
            if (list[i] == true) {
                for (int j = 2; j * i < list.length; j++) {
                    list[i * j] = false;
                }
            }
        }
        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                numbers.add(num);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            int count = 0;
            for (int j = a + 1; j <= a * 2; j++) {
                if (list[j] == true) {
                    count++;
                }
            }
            ans.add(count);
        }
        for (int i=0;i< ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}