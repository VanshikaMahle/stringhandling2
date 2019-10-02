package string;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        char ch;
        int aW;
        int uW = 0;
        int lW = 0;
        int l = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            if (ch >= 65 && ch <= 91) {
                uW += (int) ch;
            } else if (ch >= 97 && ch <= 122) {
                lW += (int) ch;
            }
        }
        aW = uW - lW;
        System.out.println(Math.abs(aW));
    }
}
