package string;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        char ch;
        int sum = 0;
        int l = s1.length();
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            if (ch >= 65 && ch <= 91) {
                sum += (int) ch;
            }
        }
        System.out.println(sum);
    }
}
