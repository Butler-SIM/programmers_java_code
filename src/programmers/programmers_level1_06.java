package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 1단계 김서방 찾기
 */
public class programmers_level1_06 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        int i = 0;

        for(i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){

                break;
            }
        }
        System.out.println("I : "+i);
    }
}
