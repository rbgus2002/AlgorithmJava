package ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3052 {
    public static void main(String[] args)throws IOException {
        System.out.println(answer());
    }
    private static int answer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int[] surplus = new int[42];
        for(int i = 0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            surplus[Integer.parseInt(st.nextToken()) % 42]++;
        }
        for(int i = 0; i < surplus.length; i++){
            if(surplus[i] > 0) count++;
        }

        return count;
    }
}
