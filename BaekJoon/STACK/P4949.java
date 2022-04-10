package STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String sentence = br.readLine();
            if(sentence.charAt(0) == '.')
                break;
            checkSentence(sentence);
        }

        System.out.println(sb);
    }

    private static void checkSentence(String sentence){
        Stack<String> paran = new Stack<>();
        boolean error = false;

        for(int i = 0 ; i < sentence.length(); i++){
            char tmp = sentence.charAt(i);
            if(tmp == '(')
                paran.push(Character.toString(tmp));
            else if(tmp == '[')
                paran.push(Character.toString(tmp));
            else if(tmp == ')'){
                if(!paran.empty() && paran.peek().equals("("))
                    paran.pop();
                else{
                    error = true;
                    break;
                }
            }
            else if(tmp == ']'){
                if(!paran.empty() && paran.peek().equals("["))
                    paran.pop();
                else{
                    error = true;
                    break;
                }
            }
            else
                continue;
        }

        if(!error && paran.empty())
            sb.append("yes").append("\n");
        else
            sb.append("no").append("\n");
    }
}
