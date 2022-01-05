package programmers.level01;

import java.util.*;

/**
 * 프로그래머스 1단계 문자열 내 마믐대로 정렬하기
 * ----------------------------------------
 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 * ---------------------------------------------------------\
 strings는 길이 1 이상, 50이하인 배열입니다.
 strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 모든 strings의 원소의 길이는 n보다 큽니다.
 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 */

public class programmers_level1_18X {
    public static void main(String[] args) {
        //    strings	                n	    return
        // ["sun", "bed", "car"]	    1	["car", "bed", "sun"]
        // ["abce", "abcd", "cdx"]	    2	["abcd", "abce", "cdx"]
        String[] answer = {};

        //String[] strings = {"sun", "bed", "car"};
        String[] strings = {"abce", "abcd", "cdx"};
        String[] strings_sort = new String[strings.length];
        Map<Integer,String> mapList = new HashMap<Integer,String>();
       // int n = 1;
        int n = 2;

        for(int i =0; i<strings.length; i++){
            mapList.put(i, String.valueOf(strings[i].charAt(n)));
        }

        System.out.println(mapList);
        int j =0;
        for (int key  :mapList.keySet()){
            strings_sort[j] = mapList.get(key);
            j++;
        }

        System.out.println(Arrays.toString(strings_sort));

    }
}

