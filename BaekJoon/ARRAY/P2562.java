package ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;
        int maxNum = 0;
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 9; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                index = i + 1;
            }
        }

        System.out.println(maxNum);
        System.out.println(index);
    }
}
