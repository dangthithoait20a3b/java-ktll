package assigment3;

import java.util.Scanner;

public class cau7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A,B;
        System.out.print("Nhập số thứ nhất: ");
        A = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        B = scanner.nextInt();
        System.out.println("\ngiá trị ban dầu của 2 số là: " + A +"  "+ B);
        int C = A;
        A = B;
        B = C;
        System.out.println("\ngiá trị của 2 số sau khi hoán vị là: "+ A +"  "+ B);


    }
}
