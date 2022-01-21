package FUNCTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(hansu(Integer.parseInt(br.readLine())));
    }

    private static int hansu(int input) {
        int count = 0;
        if (input < 100) count = input;
        else {
            count = 99; //두 자리수 까지는 모두 한수
            for (int i = 100; i <= input; i++) {
                String num = String.valueOf(i);
                int difference = num.charAt(1) - num.charAt(0);
                boolean isSame = true;
                for (int j = 0; j < num.length() - 1; j++) {
                    if (difference != num.charAt(j + 1) - num.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) count++;
            }
        }
        return count;
    }
}
