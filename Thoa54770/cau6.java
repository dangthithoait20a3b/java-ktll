package assigment3;

import java.util.Scanner;

public class cau6 {

    static boolean KiemTraSoChinhPhuong(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();
        if (KiemTraSoChinhPhuong(n))
            System.out.println(n+ " Là số chính phương");
        else
            System.out.println(n+ " Không phải là số chính phương");
    }
}
