package BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15650 {
    private static boolean[] isVisit;
    private static int[] num;
    private static int N, M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        isVisit = new boolean[N];
        num = new int[M];
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth){
        if(M == depth){
            for(int i = 0; i < num.length; i++){
                sb.append(num[i]).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < isVisit.length; i++){
            if(!isVisit[i]){
                isVisit[i] = true;
                num[depth] = i+1;
                dfs(depth+1);
                for(int j = i+1; j < isVisit.length; j++){
                    isVisit[j] = false;
                }
            }
        }
    }
}
