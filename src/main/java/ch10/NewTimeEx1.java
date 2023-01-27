package ch10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); //오늘 날짜
        LocalTime now = LocalTime.now(); //현재 시간

        LocalDate birthDate = LocalDate.of(1999, 12, 31);
        LocalTime birthTime = LocalTime.of(23, 59, 59);

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDate = " + birthDate);
        System.out.println("birthTime = " + birthTime);

        System.out.println(birthDate.withYear(2000)); //년도만 2000년으로 변경
        System.out.println(birthDate.plusDays(1)); //하루 뒤
        System.out.println(birthDate.plus(3, ChronoUnit.DAYS)); //하루 뒤

        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS)); //시간만 표시
        //특정 ChronoField 단위로 시간을 잘라서 표시
        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range()); //1~24
        System.out.println("오늘은 1년 중 " + today.get(ChronoField.DAY_OF_YEAR) + "일째 되는 날입니다."); //오늘은 1년 중 365일째 되는 날입니다.(기간을 표시)
        System.out.println("오늘은 1년 중 " + today.getDayOfWeek() + "입니다."); //오늘은 1년 중 SUNDAY입니다.
        System.out.println(ChronoField.HOUR_OF_DAY.range()); //0~23
    }

}
