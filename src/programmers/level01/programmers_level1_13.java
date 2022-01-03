package programmers.level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스 1단계 짝수와 홀수
 * ----------------------------------------
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 */

public class programmers_level1_13 {
    public static void main(String[] args) {
        int num = 2;
        String answer = "";
        if(num%2 == 0 ){
            answer = "Even";
        } else {
            answer = "Odd";
        }

        System.out.println(answer);
    }
}

