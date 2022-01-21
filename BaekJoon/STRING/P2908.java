package STRING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] sangsuNum = {"", ""};
        int[] num = new int[2];
        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < 2; i++){
            while(num[i] != 0){
                sangsuNum[i] += num[i] % 10;
                num[i] /= 10;
            }
        }
        num[0] = Integer.parseInt(sangsuNum[0]);
        num[1] = Integer.parseInt(sangsuNum[1]);
        System.out.println(num[0] > num[1] ? num[0] : num[1]);

    }
}
