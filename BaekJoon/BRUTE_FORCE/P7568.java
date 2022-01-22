package BRUTE_FORCE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[] weight = new int[repeat];
        int[] height = new int[repeat];

        for(int i =0; i < repeat; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }   //input값 입력 해줬음

        for(int i =0; i < repeat; i++){
            int rank = 1;
            for(int j = 0; j < repeat; j++){
                if(i == j) continue;

                if(weight[i] < weight[j] && height[i] < height[j]) rank++;
            }
            System.out.print(rank + " ");
        }
    }
}

/*
덩치 = (몸무게, 키)
덩치 순으로 순위 매기기
덩치 등수 -> 자신보다 덩치 큰 사람의  + 1
*/