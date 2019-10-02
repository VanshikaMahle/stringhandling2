package string;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter initial  string: ");
        String str = s.nextLine();
        System.out.println("enter string to be replaced: ");
        String strsub = s.nextLine();
        System.out.print("enter replacement string: ");
        String rep = s.nextLine();
        System.out.println(str.replaceAll(strsub,rep));
    }
}
