package ch10;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterEx1 {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        String[] PatternArr = {
            "yyyy-MM-dd HH:mm:ss.SSS",
            "''yy년 MMM dd일 E요일",
            "yyyy-MM-dd HH:mm:ss.SSS Z VV",
            "yyyy-MM-dd hh:mm:ss a",
            "오늘은 올 해의 D번째 날입니다.",
            "오늘은 이 달의 d번째 날입니다.",
            "오늘은 올 해의 w번째 주입니다.",
            "오늘은 이 달의 W번째 주입니다.",
            "오늘은 이 달의 F번째 E요일입니다.",
            "오늘은 이 달의 W번째 W요일입니다."
        };
        for (String s : PatternArr) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(s);
            System.out.println(zonedDateTime.format(formatter));
        }
    }

}

