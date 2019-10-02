package string;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int l = s1.length();
        int sum = 0;
        char ch;
        for (int i = 0; i < l; i++) {
            ch = s1.charAt(i);
            sum += (int) ch;
        }
        System.out.println(sum);
    }
}
