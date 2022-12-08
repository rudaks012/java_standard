package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for (String s : result) {
            System.out.println(s + "|");
        }
        System.out.println("개수: " + result.length);

        int i = 0;
        for(;st.hasMoreTokens(); i++) {
            System.out.println(st.nextToken() + "|");
        }
        System.out.println("개수: " + i);
    }
}
