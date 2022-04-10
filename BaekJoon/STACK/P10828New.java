package STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10828New{
    private static int[] array = new int[100001];
    private static int index = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String instruction; //input method

        for(int i = 0 ; i < repeat; i++){
            instruction = br.readLine();
            run(instruction);
        }

        System.out.println(sb);
    }
    private static void run(String instruction){
        //push 명령어면 토큰 나눠서 num변수에 정수 넣어준다
        StringTokenizer st = new StringTokenizer(instruction);
        String method = st.nextToken();
        int num = 0;

        if(method.equals("push"))
            num = Integer.parseInt(st.nextToken());

        switch(method){
            case "push":
                push(num);
                break;
            case "pop":
                pop();
                break;
            case "size":
                size();
                break;
            case "empty":
                empty();
                break;
            case "top":
                top();
                break;
            default:
                System.exit(0);

        }
    }

    private static void push(int num){
        array[index] = num;
        index++;
    }

    private static void pop(){
        if(index == 0){
            sb.append(-1).append("\n");
            return;
        }

        sb.append(array[index-1]).append("\n");
        array[index-1] = 0;
        index--;
    }

    private static int size(){
        sb.append(index).append("\n");
        return index;
    }

    private static void empty(){
        if(index == 0)
            sb.append(1).append("\n");
        else
            sb.append(0).append("\n");
    }

    private static void top(){
        if(index == 0) {
            sb.append(-1).append("\n");
            return;
        }
        sb.append(array[index-1]).append("\n");
    }
}
