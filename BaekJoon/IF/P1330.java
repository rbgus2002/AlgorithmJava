package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(versus(A, B));
    }

    public static String versus(int num1, int num2){
        String answer;
        if(num1 > num2)
            answer = ">";
        else if(num1 < num2)
            answer = "<";
        else
            answer = "==";

        return answer;
    }
}
