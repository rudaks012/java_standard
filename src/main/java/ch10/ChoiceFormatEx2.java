package ch10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String patten = "60#D|70#C|80<B|90#A";
        int[] scores = {91, 90, 80, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(patten);
        for (int score : scores) {
            System.out.println(score + ":" + form.format(score));
        }
    }
}
