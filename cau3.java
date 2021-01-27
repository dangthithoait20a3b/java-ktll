package giuakylan2;

import java.util.Scanner;

public class cau3 {
    //1.1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int A[] = new int[n];
        for (int i = 1; i < n; i++) {
            System.out.println("Phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 1; i < n; i++) {
            System.out.println(A[i] + "\t");
        }
        //3.1
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        int max1 = A[0];
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > max2) {
                if (A[i] > max1) {
                    max2 = max1;
                    max1 = A[i];
                } else
                    max2 = A[i];
            } else if (max2 >= max1)
                max2 = A[i];
        }
        System.out.println("Giá trị lớn thứ 2 trong mảng là: " + max2);
        //3.2
        //3.3
    }
}
