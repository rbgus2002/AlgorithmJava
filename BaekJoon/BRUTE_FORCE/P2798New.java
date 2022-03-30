package BRUTE_FORCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2798New {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numList = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numList.length; i++){
            numList[i] = Integer.parseInt(st.nextToken());
        }

        blackJack(numList, M);


    }

    private static void blackJack(int[] numList, int M){
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < numList.length-2; i++){
            for(int j = i+1; j < numList.length-1; j++){
                for(int k = j+1; k < numList.length; k++){
                    sum = numList[i] + numList[j] + numList[k];
                    if(sum <= M && max < sum)
                        max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
