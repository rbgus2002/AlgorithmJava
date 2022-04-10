package BACKTRACKING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9663 {
    private static int[] queensPlace;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] chessTable = new boolean[N][N];
//        int answer = nQeeunNum(chessTable);
//        System.out.println(answer);
    }

    private static void dfs(int depth) {

    }

    private static int booleanArrayTrueNum(boolean[][] chessTable){
        int count = 0;
        for(int i = 0 ; i < chessTable.length; i++){
            for(int j = 0; j < chessTable[0].length; j++){
                if(chessTable[i][j] == true)
                    count++;
            }
        }
        return count;
    }


}


/*
N-queens Problem
같은 행, 같은 열, 같은 대각선 상에 위치X
 */
