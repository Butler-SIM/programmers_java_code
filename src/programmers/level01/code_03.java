package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class code_03 {
    public static void main(String[] args) {
        //[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
        //[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
        //[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
       int [] array = {1, 5, 2, 6, 3, 7, 4};
       int[][] commends = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        //	[5, 6, 3]
        ArrayList result = new ArrayList();
        int[] result_arr = new int[commends.length];
        for(int i = 0; i<commends.length; i++){
            for(int j=commends[i][0]; j<= commends[i][1]; j++){
                System.out.println(array[j-1]);
                result.add(array[j-1]);
                if (j == commends[i][1]){
                    Collections.sort(result);
                    result_arr[i] = (int) result.get(commends[i][2]-1);
                    result.clear();
                }
            }
        }

        System.out.println(Arrays.toString(result_arr));

    }
}
