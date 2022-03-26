package STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int[] answer = new int[repeat];
        int sum = 0;

        for(int i = 0; i < repeat; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                for(int j = i; j >= 0; j--){
                    if (answer[j] != 0) {
                        answer[j] = 0;
                        break;
                    }
                }
            }
            else answer[i] = num;
        }

        for(int i = 0; i < repeat; i++){
            sum += answer[i];
        }

        System.out.println(sum);
    }
}
