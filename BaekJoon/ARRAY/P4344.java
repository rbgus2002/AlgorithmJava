package ARRAY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4344 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            averageUpStudentRate();
        }
}

    private static void averageUpStudentRate() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int studentNum = Integer.parseInt(st.nextToken());  //학생 수
        double sum = 0;
        double average; //평균
        double count = 0;  //평균 넘는 학생
        double[] studentScore = new double[studentNum];

        for(int i =0; i < studentNum; i++){
            studentScore[i] = Double.parseDouble(st.nextToken());
        }   //double[] 배열에 각 학생 점수 담았음

        for(int i =0; i < studentNum;i ++){
            sum += studentScore[i];
        }
        average = sum / studentNum; //반평균 담음

        for(int i = 0; i < studentNum; i++){
            if(studentScore[i] > average) count++;
        } //평균 넘는 학생 수 구함

        System.out.print(String.format("%.3f", (double) count / studentNum * 100) + "%" + "\n");
    }
}
