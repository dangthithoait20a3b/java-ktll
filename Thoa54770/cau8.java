package assigment3;

import java.util.Scanner;

public class cau8 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Nhập số nguyên dương A = ");
        int A = scanner.nextInt();
        System.out.print("Nhập số nguyên dương B = ");
        int B = scanner.nextInt();
        System.out.println("Ước chung lớn nhất của " + A + " và " + B + " là: " + UCLN(A, B));
    }
    public static int UCLN ( int A, int B){
        int temp1 = A;
        int temp2 = B;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int ucln = temp1;
        return ucln;
    }

}
