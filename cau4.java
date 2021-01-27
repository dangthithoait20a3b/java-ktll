package baitapontapcuoinam;

import java.util.Scanner;

public class cau4 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Liệt kê tất cả số nguyên tố có 5 chữ số:");
        for (int i = 10001; i < 99999; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Tổng số các số nguyên tố có 5 chữ số là: " + count);
    }

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
