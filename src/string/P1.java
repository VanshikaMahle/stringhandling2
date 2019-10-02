package string;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int l = s1.length();
        System.out.print("index: ");
        for (int i = 0; i < l; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("chars: ");
        for (int j = 0; j < l; j++) {
            System.out.print(s1.charAt(j) + " ");
        }
    }
}
