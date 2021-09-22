import java.io.IOException;

public class Main {
    public static void getNum() {
        int[] num = new int[10000];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        for (int i = 1; i < num.length + 1; i++) {
            int trans = i;
            int num2 = i;
            while (trans != 0) {
                num2 = num2 + trans % 10;
                trans = trans / 10;
            }
            for (int j = 0; j < num.length; j++) {
                if (num2 == num[j]) {
                    num[j] = 0;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        getNum();
    }
}
