package SORTING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[] num = new int[repeat];

        for(int i = 0; i < repeat; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < repeat-1; i++){
            for(int k = i+1; k < repeat; k++){
                if(num[i] > num[k]){
                    int temp = num[i];
                    num[i] = num[k];
                    num[k] = temp;
                }
            }
        }

        for(int i =0; i < repeat; i++){
            System.out.println(num[i]);
        }
    }
}

//Arrays.sort(num) 써도 됨
