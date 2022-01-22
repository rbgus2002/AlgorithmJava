package BRUTE_FORCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardNum = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = 0;
        int[] card = new int[cardNum];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cardNum; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < cardNum - 2; i++) {
            for (int j = i+1; j < cardNum - 1; j++) {
                for (int k = j+1; k < cardNum; k++) {
                    int sum = 0;
                    if (card[i] + card[j] + card[k] <= M) sum = card[i] + card[j] + card[k];
                    if (max < sum) max = sum;
                }
            }
        }
        System.out.println(max);
    }
}


/*
블랙잭 게임
카드의 합 <= 21 && 최대한 크게

브루트포스의 개념을 새기면서 푸니까 훨씬 쉬웠음
 */