package programmers.level01;

/**
 * 프로그래머스 1단계 수박수박수?
 */

public class programmers_level1_09 {
    public static void main(String[] args) {
        String answer = "";
        String su = "수";
        String bak = "박";
        int n = 3;

        for (int i = 0; i<n; i++){
            if(i%2 == 0){
                answer += su;
            } else {
                answer += bak;
            }
        }

        System.out.println("answer : " + answer );
    }
}

