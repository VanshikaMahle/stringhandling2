package string;

import java.util.Scanner;

public class P10a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        char c = s.nextLine().charAt(0);
        int l = s1.length();
        System.out.println("Output: ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == c) {
                System.out.println(i);
                break;
            }

        }
    }

}
