package BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15651 {
    private static StringBuilder sb = new StringBuilder();
    private static boolean[] N;
    private static int[] M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = new boolean[Integer.parseInt(st.nextToken())];
        M = new int[Integer.parseInt(st.nextToken())];
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth){
        if(depth == M.length){
            for(int i = 0 ; i < M.length; i++){
                sb.append(M[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0 ; i < N.length; i++){
            M[depth] = i+1;
            dfs(depth+1);
        }
    }
}
