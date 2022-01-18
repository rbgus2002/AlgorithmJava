package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        print99Dan(num);
    }

    private static void print99Dan(int num){
        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
