package SORTING;
//소트 인사이드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
//        reverseSorting(num);
        anotherReverse(num);
    }
    private static void reverseSorting(String num){
        int[] number = new int[num.length()];
        for(int i = 0; i < number.length; i++){
            number[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        Arrays.sort(number);
        for(int i = number.length-1; i >= 0; i--){
            System.out.print(number[i]);
        }
    }

    private static void anotherReverse(String num){
        int[] number = new int[10];
        for(int i = 0; i < num.length(); i++){
            number[num.charAt(i) - '0']++;
        }
        for(int i = 9; i >= 0; i--){
            for(int k = 0; k < number[i]; k++){
                System.out.print(i);
            }
        } // 2 3 0 3 2
    }
}
