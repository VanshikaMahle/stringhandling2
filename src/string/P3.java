package string;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int l = s1.length();
        s1 = s1.toLowerCase();
        for(int i=0;i<l;i++){
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                s1 = s1.replace(ch, '*');
            }
        }
        System.out.println(s1);
    }
}