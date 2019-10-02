package string;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int n = s.nextInt();
        System.out.print(s1.substring(n));
    }
}