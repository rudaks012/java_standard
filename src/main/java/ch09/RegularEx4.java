package ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx4 {
    public static void main(String[] args) {
        String source = "A broken hand works, but not a broken heart.";
        String patten = "broken";
        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile(patten);
        Matcher m = p.matcher(source);
        System.out.println("source:" + source);

        int i = 0;

        while (m.find()) {
            System.out.println(++i + ":" + m.start() + "~" + m.end());
            sb.append(source.substring(m.start(), m.end()));
            //broken을 drunken으로 치환 하여 sb에 저장
            m.appendReplacement(sb, "drunken");
        }
        m.appendTail(sb);
        System.out.println("Replacement count:" + i);
        System.out.println("result:" + sb.toString());
    }
}
