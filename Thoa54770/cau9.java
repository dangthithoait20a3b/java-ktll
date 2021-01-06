package assigment3;

import java.util.Scanner;

public class cau9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mảng có số phần tử là : ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        //cau9.1
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + (i+1) + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("\nMảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }

        //cau9.2
        int dem = 0;
        System.out.println("");
        System.out.print("\nSố giá trị chia hết cho 3 mà không chia hết cho 4 là : ");
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0) {
                if (A[i] % 4 != 0) {
                    dem++;
                }
            }
        }
        System.out.println(dem);

        //cau9.3
        int max = A[0];
        int min = A[0];
        for (int i = 0; i < n; i++) {
            if (max < A[i]) {
                max = A[i];
            }
            if (min > A[i]) {
                min = A[i];
            }
        }
        System.out.print("\nGiá trị lớn nhất trong mảng là : " + max);
        System.out.print("\nGiá trị nhỏ nhất trong mảng là : " + min);

        //cau9.4
        int X, m;
        System.out.println("");
        System.out.print("\nNhập vào giá trị cần kiểm tra trong mảng: ");
        m = scanner.nextInt();
        for (X = 0; X < n; X++) {
            if (A[X] == m) {
                System.out.println(m + " đang tồn tại trong mảng. ");
                break;
            }
        }
        if (X == n)
            System.out.println(m + " không tồn tại trong mảng.");

        //cau9.5
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Dem++;
            }
        }
        System.out.println("\nSố các số chẵn trong mảng là : " + Dem);

        //cau9.6
        int j =0;
        int[] B = new int[n];
        for (int i=0;i<n;i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }
        System.out.println("\nCác phần tử của mảng là số chẵn gồm: ");
        for (int i = 0; i < j; i++) {
            System.out.print(B[i] + "\t");
        }
    }
}
