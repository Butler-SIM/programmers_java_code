package programmers.level01;

/**
 * 프로그래머스 이상한 문자 만들기
 * ----------------------------------------
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 *
 * ---------------------------------------------------------\
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */

public class programmers_level1_14X {
    public static void main(String[] args) {

        String s = "try hello world";
        String [] s_arr = s.split(" ");
        String result = "";
        for(String i :s_arr){
            System.out.println(i);
            for (int j =0; j<i.length(); j++){
                if (j % 2 == 0){
                    char c = Character.toUpperCase(i.charAt(j));
                    result += c;
                } else {
                    result += i.charAt(j);
                }
            }
            result += " ";
        }

        System.out.println(result.substring(0, result.length() -1));
    }
}

