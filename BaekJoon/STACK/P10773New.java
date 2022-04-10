package STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773New {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        Stack<Integer> stack = stackInput(repeat);
        int sum = stackSum(stack);
        System.out.println(sum);
    }

    private static Stack<Integer> stackInput(int repeat) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        for(int i = 0 ; i < repeat; i++){
            num = Integer.parseInt(br.readLine());

            if(num == 0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }

        return stack;
    }

    private static int stackSum(Stack<Integer> stack){
        int sum = 0;
        int stackSize = stack.size();
        for(int i = 0 ; i < stackSize; i++){
            sum += stack.pop();
        }

        return sum;
    }

}
