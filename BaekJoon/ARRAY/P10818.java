package ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[] array = new int[repeat];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < repeat; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
    }
    private static void minmax(StringTokenizer st, int repeat){
        int min = 1000001, max = -1000001;
        for(int i = 0; i < repeat; i++){
            int num = Integer.parseInt(st.nextToken());
            if(min > num) min = num;
            if(max < num) max = num;
        }
        System.out.println(min + " " + max);
    }
}
