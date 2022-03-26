package BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15649 {
    private static int[] arr;
    private static boolean[] isVisit;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        isVisit = new boolean[N];
        arr = new int[M];

        BT(N, M, 0);
        System.out.println(sb);
    }

    private static void BT(int N, int M, int depth) {
        if (M == depth) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisit[i]) {    //방문한 적이 없으면
                isVisit[i] = true;
                arr[depth] = i + 1;
                BT(N, M, depth + 1);
                isVisit[i] = false;
            }
        }
    }
}

/*
nPm
 */
