package assigment3;

import java.util.Scanner;

public class cau4 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, A = ");
        float A = cau4.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, B = ");
        float B = cau4.scanner.nextFloat();
        float C = 0;
        cau4.ptb2(A, B, C);
    }
    public static void ptb2(float A, float B, float C) {
        if (A == 0) {
            if (B == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-C / B));
            }
            return;
        }
        float delta = B*B - 4*A*C;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-B + Math.sqrt(delta)) / (2*A));
            x2 = (float) ((-B - Math.sqrt(delta)) / (2*A));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-B / (2 * A));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
