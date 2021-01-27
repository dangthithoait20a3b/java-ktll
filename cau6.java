package baitapontapcuoinam;

import java.util.Scanner;

public class cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập xâu thứ nhất: ");
        String s1 = sc.next();
        System.out.println("Nhập xâu thứ hai: ");
        String s2 = sc.next();

        System.out.println(s1.contains(s2));
    }
}
