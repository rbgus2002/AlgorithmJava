package LEVEL2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OpenChatting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String[] record = new String[100001]; //record 배열의 길이 1 ~ 100,000
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] answer;
        int index = 0;
//        while (st.hasMoreTokens()) {
//            record[index] = st.nextToken();
//        }   //record 배열에 값 넣었음

        answer = solution(record);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static String[] solution(String[] record) {
        String[] methodToUserId = new String[record.length];   //method와 UserId 매칭
        Map<String, String> userIdToNickName = new LinkedHashMap<>(); //UserId와 NickName 매칭 (순서 보장 되는 linekdHashMap)
        int count = 0;
        for (int i = 0; i < record.length; i++) {                     //하나의 명령씩 들여다 보기

            StringTokenizer st = new StringTokenizer(record[i]);    //각 단어 나누기
            String method = st.nextToken();     //Enter, Leave, Change
            String userId = st.nextToken();     //고유값
            String nickName = null;             //닉네임
            if (method.equals("Enter") || method.equals("Change")) {
                nickName = st.nextToken();
            }

            switch (method) {
                case "Enter": {
                    methodToUserId[i] = method + " " + userId;
                    userIdToNickName.put(userId, nickName);
                    break;
                }
                case "Leave": {
                    methodToUserId[i] = method + " " + userId;
                    break;
                }
                case "Change": {
                    userIdToNickName.put(userId, nickName);
                    count++;
                    break;
                }
            }
        }
        String[] supervisorWindow = new String[methodToUserId.length - count];

        for (int i = 0; i < methodToUserId.length && methodToUserId[i] != null; i++) {
            StringTokenizer st = new StringTokenizer(methodToUserId[i]);
            String method = st.nextToken();
            String userId = st.nextToken();

            switch (method){
                case "Enter":{
                    supervisorWindow[i] = userIdToNickName.get(userId) + "님이 들어왔습니다.";
                    break;
                }
                case "Leave":{
                    supervisorWindow[i] = userIdToNickName.get(userId) + "님이 나갔습니다.";
                }
            }
        }

        return supervisorWindow;
    }
}

/*
user id로 구분

Enter [user id] [nickname]
Leave [user id]
Change [user id] [changeNickname]

id 변경 시 기존 채팅방에서도 모두 교체

HashMap : userId <-> nickName
HashMap : method <-> userId



 */
