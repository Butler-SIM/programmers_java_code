package programmers;

/**
 * 프로그래머스 1단계 두 정수 사이의 합
 *
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 *
 */

public class programmers_level1_10 {
    public static void main(String[] args) {

        int a = 7;
        int b = 7;
        long answer = a+b;

        if(a > b){
            for (int i = b +1; i<a; i++){
                answer += i;
            }
        } else if(a < b){
            for (int i = a +1; i<b; i++){
                answer += i;
            }
        } else if(a == b){
            answer = a;
        }

        System.out.println("answer : " + answer );
    }
}

