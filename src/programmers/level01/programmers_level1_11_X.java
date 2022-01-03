package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

/**
 * 프로그래머스 1단계 제일 작은 수 제거하기
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 */

public class programmers_level1_11_X {
    public static void main(String[] args) {
        int [] arr ={1,1,2,3,4,5,6,7,8};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer [] answer = new Integer[arr.length-1];

        for(int i = 0; i<answer.length; i++){
            answer[i] = arr[i+1];
        }
        Arrays.sort(answer, Collections.reverseOrder());

        if(answer.length == 0){
            answer = new Integer[1];
            answer[0]=-1;
        }

        int [] result_arr = new int[answer.length];
        for (int i =0; i<answer.length; i++){
            result_arr[i] = answer[i];
        }

        System.out.println("answer : " + Arrays.toString(result_arr) );
        System.out.println("answer22 : " + Arrays.toString(result_arr) );
    }
}

