package ch10;

import java.util.Calendar;

public class CalendarEx5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CalendarEx5 2015 9");
            return;
        }
        int year = Integer.parseInt(args[0]); // 시작일
        int month = Integer.parseInt(args[1]); //끝일

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); //끝일

        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        // 다음달의 첫날에서 하루를 빼면 현재달의 마지막날이 된다.
        // 12월 1일에서 하루를 빼면 11월 30일이 된다.
        eDay.add(Calendar.DATE, -1);

        // 첫번째 요일이 무슨 요일인지 알아낸다.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("    " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
        // 만일 1일이 수요일이라면 공백을 세번 찍는다.(일요일부터 시작)
        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) System.out.println();
        }
    }
}
