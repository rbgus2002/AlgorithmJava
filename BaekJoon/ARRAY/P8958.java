package ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String[] OX = new String[repeat];
        for (int i = 0; i < repeat; i++) {
            OX[i] = br.readLine();
        }

        scoreCheck(OX);
    }

    private static void scoreCheck(String ox[]) {
        for (int i = 0; i < ox.length; i++) {
            int count = 0;
            int score = 0;
            for (int j = 0; j < ox[i].length(); j++) {
                if (ox[i].charAt(j) == 'O') count++;
                else if (ox[i].charAt(j) == 'X') count = 0;
                score += count;
            }
            System.out.println(score);
        }
    }
}
