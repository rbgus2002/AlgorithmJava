package STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String[] input = new String[repeat];
        for (int i = 0; i < input.length; i++) {
            input[i] = br.readLine();
        }

        for (int i = 0; i < input.length; i++) {
            checkVPS(input[i]);
        }

        System.out.println(sb);
    }

    private static void checkVPS(String input) {
        Stack<String> PS = new Stack<>();
        boolean isError = false;

        for(int i = 0 ; i < input.length(); i++){
            char tmp = input.charAt(i);
            if(tmp == '(')
                PS.push(Character.toString(tmp));
            else if(tmp == ')'){
                if(!PS.empty() && PS.peek().equals("("))
                    PS.pop();
                else{
                    isError = true;
                    break;
                }
            }
        }

        if(!isError && PS.empty())
            sb.append("YES").append("\n");
        else
            sb.append("NO").append("\n");

    }
}
