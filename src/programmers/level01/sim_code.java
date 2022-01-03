package programmers.level01;

import java.util.*;

public class sim_code {
    public static void main(String[] args) {
        int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves =  {1,5,3,5,1,2,1,4};

        int result_array[] = new int[moves.length];
        ArrayList my_list = new ArrayList();

        //moves대로 추출, 추출후0으로 초기화
        for(int c=0; c<moves.length; c++){
            for(int i=0; i<=board.length-1; i++){
                if(result_array[c] == 0){
                    for(int j=0; j<=board[board.length-1].length-1; j++){
                        if(board[j][moves[c]-1] != 0) {
                            my_list.add(board[j][moves[c]-1]);
                            result_array[c] = board[j][moves[c]-1];

                            board[j][moves[c]-1] = 0;
                            break;
                        }
                    }
                }
            }
        }

        int result_count = 0;
        int remove_my_list = 0;
        for(int i = 0; i < my_list.size()-1; i++){
            System.out.println("!!! :" + my_list.get(i));
            if(my_list.get(i) == my_list.get(i+1)){
                System.out.println("remove 1 :" + my_list.get(i));
                my_list.remove(i);
                System.out.println("remove 2 :" + my_list.get(i));
                my_list.remove(i);

                result_count += 2;
                i = 0 ;
                remove_my_list = my_list.size();
            }
        }



        System.out.println("RESULT : " + result_count);




        //return result_array.length;
    }
}


// 00000                       00 01 02 03 04
// 00103                       10 11 12 13 14
// 02501  (5*5  , 30*30)       20 21 22 23 24
// 42442                       30 31 32 33 34
// 35131   43113204            40 41 42 43 44


//class Solution {
//    public int solution(int[][] board, int[] moves) {
//        int result_array[] = new int[moves.length];
//        ArrayList my_list = new ArrayList();
//
//        //moves대로 추출, 추출후0으로 초기화
//        for(int c=0; c<moves.length; c++){
//            for(int i=0; i<=board.length-1; i++){
//                if(result_array[c] == 0){
//                    for(int j=0; j<=board[board.length-1].length-1; j++){
//                        if(board[j][moves[c]-1] != 0) {
//                            my_list.add(board[j][moves[c]-1]);
//                            result_array[c] = board[j][moves[c]-1];
//
//                            board[j][moves[c]-1] = 0;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        List result_list= Arrays.asList(result_array);
//        int answer = 0;
//        // for(int i=0; i<result_list.size(); i++){
//        //     answer += result_list;
//        // }
//
//        return my_list.size();
//        //return result_array.length;
//    }
//}