package assigment3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cau3 {
    public static void main(String[] args) {
        int A, B;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số A: ");
        A = scanner.nextInt();
        System.out.println("Nhập vào số B: ");
        B = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + A + "x + " + B + " = 0.");
        if (A == 0) {
            if (B == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -B / A;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}
