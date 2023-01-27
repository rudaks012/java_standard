package ch10;


import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NewTimeEx3 {

      static class DayAfterTomorrow implements TemporalAdjuster {

        //TemporalAdjuster 인터페이스의 adjustInto() 메서드를 구현
        //Temporal 인터페이스는 날짜와 시간을 조정할 수 있는 메서드를 제공
        //Temporal 인터페이스를 구현한 LocalDate, LocalTime, LocalDateTime 클래스의 인스턴스를 매개변수로 받아서 조정한 후 반환
        @Override
        public Temporal adjustInto(Temporal temporal) {
            return temporal.plus(2, ChronoUnit.DAYS);
        }
    }

    static void p(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);

        p(today.with(firstDayOfNextMonth())); //다음 달의 첫 번째 날
        p(today.with(firstDayOfMonth())); //이번 달의 첫 날
        p(today.with(lastDayOfMonth())); //이번 달의 마지막 날
        p(today.with(firstInMonth(TUESDAY))); //이번 달의 첫 번째 수요일
        p(today.with(lastInMonth(TUESDAY))); //이번 달의 마지막 수요일
        p(today.with(previous(TUESDAY))); //지난 수요일
        p(today.with(previousOrSame(TUESDAY))); //지난 수요일 혹은 오늘
        p(today.with(next(TUESDAY))); //다음 수요일
        p(today.with(nextOrSame(TUESDAY))); //다음 수요일 혹은 오늘
        p(today.with(dayOfWeekInMonth(4, TUESDAY))); //이번 달의 네 번째 수요일
    }

}
