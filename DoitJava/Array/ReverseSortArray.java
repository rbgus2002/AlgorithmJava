package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseSortArray {
    public static void main(String[] args) throws IOException {
        int[] num = new int[6];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; st.hasMoreTokens(); i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        reverseArray(num);

    }
    private static void swap(int[] num, int idx1, int idx2){
        int tmp = num[idx1];
        num[idx1] = num[idx2];
        num[idx2] = tmp;
        System.out.printf("\na[%d]과(와) a[%d]를 교환합니다.\n", idx1, idx2);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

    }
    private static void reverseArray(int[] num){
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        for(int i = 0 ; i < num.length/2; i++){
            swap(num, i, num.length-(i+1));
        }
    }
}
