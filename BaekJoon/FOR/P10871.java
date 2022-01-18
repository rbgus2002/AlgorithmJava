package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] num = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(st.nextToken());
            if(input < X) System.out.print(input + " ");
        }
    }
}
