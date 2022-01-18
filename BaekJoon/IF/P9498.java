package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        System.out.println(scoreToAlphabet(score));
    }

    private static String scoreToAlphabet(int score){
        String answer = "F";
        if(score <= 100 && score >= 90)
            answer = "A";
        else if(score <= 89 && score >= 80)
            answer = "B";
        else if(score <= 79 && score >=70)
            answer = "C";
        else if(score <= 69 && score >= 60)
            answer = "D";

        return answer;
    }
}
