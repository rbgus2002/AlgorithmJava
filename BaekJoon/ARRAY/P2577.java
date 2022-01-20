package ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] num = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String answer = String.valueOf(A*B*C);

        for(int i =0; i < answer.length(); i++){
//            num[Integer.parseInt(Character.toString(answer.charAt(i)))]++;        방법1
            num[answer.charAt(i) - '0']++;                                        //방법2
        }

        for(int i : num){
            sb.append(i + "\n");
        }
        System.out.println(sb.toString());
    }
}
