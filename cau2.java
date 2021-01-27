package giuakylan2;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N: ");
        int n = scanner.nextInt();
        int A[] = new int[n];
        // 2.1
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + "\t");
        }
        //2.2
        int dem = 1;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 2 != 0) {
                dem++;
            }
        }
        System.out.println("có " + dem + " số phần tử chia hết cho 3 mà không chia hết cho 2");
        //2.3
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        //2.4
        int X, Y;
        System.out.println("Nhập vào giá trị cần kiểm tra");
        Y = scanner.nextInt();
        for (X = 0; X < n; X++) {
            if (A[X] == Y) {
                System.out.println(Y + " có tồn tại trong mảng A");
                break;
            }
        }
        if (X == n)
            System.out.println(Y + " không tồn tại trong mảng A");
        //2.5
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Dem++;
            }
        }
        System.out.println("Trong mảng A có " + Dem + " giá trị chẵn");
        //2.6
        int j =0;
        int[] B = new int[n];
        for (int i=0;i<n;i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }
        System.out.println("Các phần tử số chẵn trong mảng B là: ");
        for (int i = 0; i < j; i++) {
            System.out.println(B[i] + "\t");

        }
    }
}
