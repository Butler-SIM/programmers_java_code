package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스 1단계 문자열 내림차순으로 배치하기
 * ----------------------------------------
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 */

public class programmers_level1_12 {
    public static void main(String[] args) {

        String s = "Zbcdefg";
        List s_arr = new ArrayList();
        String answer = "";

        for (int i =0; i<s.length(); i++){
            s_arr.add(s.charAt(i));
        }
        Collections.sort(s_arr,Collections.reverseOrder());
        for(int i = 0; i<s_arr.size(); i++){
            answer += s_arr.get(i);
        }

        System.out.printf(answer);

    }
}

