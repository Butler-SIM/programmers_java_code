package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 1단계 같은 숫자는 싫어
 */
public class programmers_level1_05 {
    public static void main(String[] args) {
        int [] arr ={1,1,3,3,0,1,1};
        List<Integer> answer = new ArrayList<Integer>();



        for(int i = 0; i<arr.length; i++){
            if(answer.size() == 0 ){
                answer.add(arr[i]);
                continue;
            }
            if(arr[i-1] != arr[i] ){
                answer.add(arr[i]);
            }
        }
        int [] result = new int[answer.size()];
        for(int i = 0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
