package giuakylan2;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập y: ");
        int y = scanner.nextInt();
        if(x>3 && y>3){
            System.out.println("Trước khi hoán vị " + x + "\t" +y);
            int c = x;
            x=y;
            y=c;
            System.out.println("Sau khi hoán vị " + x +"\t" +y);
        }else{
            System.out.println(" nhập lại: Điều kiện sai");
        }
    }
}
