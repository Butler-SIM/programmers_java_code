package programmers.level01;

public class code_04 {
    public static void main(String[] args) {
        /**
         * 프로그래머스 1단계 가운데 글자 가져오기
         */
        String s = "abcde";
        //String s = "qwer";
        String text = "";
        if(s.length() % 2 == 1){
            System.out.println(s+ "가운데 글자 : " + s.substring(s.length()/2,s.length()/2 +1 ));
        }
        else {
            System.out.println(s+" 가운데 글자 :" + s.substring(s.length()/2 - 1,s.length()/2 +1 ));
        }
    }
}
