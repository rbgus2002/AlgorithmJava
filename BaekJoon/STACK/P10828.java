package STACK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10828 {
    private static int[] array = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            int num = 0;
            if (method.equals("push")) num = Integer.parseInt(st.nextToken());
            switch (method) {
                case "push": {
                    push(num);
                    break;
                }

                case "pop": {
                    pop();
                    break;
                }

                case "size": {
                    System.out.println(size());
                    break;
                }

                case "empty": {
                    System.out.println(empty());
                    break;
                }

                case "top": {
                    top();
                    break;
                }

                default:
                    System.out.println("잘못된 메소드 입력입니다.");
            }
        }
    }

    private static void push(int num) {
        array[size()] = num;
    }

    private static void pop() {
        if (size() == 0) System.out.println(-1);
        else {
            System.out.println(array[size() - 1]);
            array[size() - 1] = 0;
        }
    }

    private static int size() {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                size = i;
                break;
            }
        }
        return size;
    }

    private static int empty() {
        if (size() == 0) return 1;
        else return 0; //비어있지 않으면 0 리턴
    }

    private static void top() {
        if (size() == 0) System.out.println(-1);
        else System.out.println(array[size() - 1]);
    }
}

/*
Stack 구현
1. int 배열로 구현
2. Vector로 구현
 */