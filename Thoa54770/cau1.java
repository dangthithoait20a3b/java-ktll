package assigment3;

import java.util.Scanner;

public class cau1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần kiểm tra: ");
        int n = scanner.nextInt();
        if (n>2){
            if(n%2==0){
                System.out.print("\nĐây là số chẵn.");
            }
            if(n%2!=0){
                System.out.print("\nĐây là số lẻ.");
            }
        }else{
            System.out.print("\nYêu cầu số cần kiểm tra phải lớn hơn 2.");
        }
    }
}
