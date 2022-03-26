package DYNAMIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            int[] answerCount = new int[2];
            fibonacciCount(Integer.parseInt(br.readLine()), answerCount);
            sb.append(answerCount[0]).append(" ").append(answerCount[1]).append("\n");
        }

        System.out.println(sb);
    }

    private static void fibonacciCount(int num, int[] answerCount) {
        if (num == 0) answerCount[0]++;
        else if (num == 1) answerCount[1]++;
        else {
            fibonacciCount(num - 2, answerCount);
            fibonacciCount(num - 1, answerCount);
        }
    }
}
