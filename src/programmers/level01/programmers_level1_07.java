package programmers.level01;

import java.util.*;

/**
 * 프로그래머스 1단계 핸드폰 번호 가리기
 */
public class programmers_level1_07 {
    public static void main(String[] args) {
        String answer = "01033334444";
        String replaece_answer = "";

        for(int i =0; i<answer.length()-4; i++){
            replaece_answer += answer.substring(0,i).replace(answer.substring(0,i),"*");
        }

        System.out.println(replaece_answer+""+answer.substring(answer.length()-4));
    }
}

