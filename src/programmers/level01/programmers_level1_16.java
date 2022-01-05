package programmers.level01;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 프로그래머스 1단계 2016년
 * ----------------------------------------
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아
 * 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
 * 입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 *
 *
 * ---------------------------------------------------------\
 2016년은 윤년입니다.
 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 */

public class programmers_level1_16 {
    public static void main(String[] args) {

        int a = 5;
        int b = 24;

        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        String result = "";

        if(dayOfWeekNumber == 1){
            result = "MON";
        } else if(dayOfWeekNumber == 2){
            result = "TUE";
        } else if(dayOfWeekNumber == 3){
            result = "WED";
        } else if(dayOfWeekNumber == 4){
            result = "THU";
        } else if(dayOfWeekNumber == 5){
            result = "FRI";
        } else if(dayOfWeekNumber == 6){
            result = "SAT";
        } else if(dayOfWeekNumber == 7){
            result = "SUN";
        }

        System.out.println(result);




    }
}

