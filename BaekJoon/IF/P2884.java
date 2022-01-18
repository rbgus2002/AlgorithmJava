package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        alarm(time);
    }

    private static void alarm(String time){
        StringTokenizer st = new StringTokenizer(time);
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M-45 < 0){
            M = 60 - (45 - M);
            H--;
            if(H < 0)
                H += 24;
        }
        else{
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}
