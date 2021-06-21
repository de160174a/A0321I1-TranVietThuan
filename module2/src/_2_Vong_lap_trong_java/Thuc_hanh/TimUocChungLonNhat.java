package Thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so b: ");
        int b = scanner.nextInt();
        if(a==0 || b==0) {
            System.out.println("Khong co uoc chung lon nhat");
            System.exit(0);
        }
        while (a!=b){
            if(a>b) a = a - b;
            else b = b - a;
        }
        System.out.println("Uoc chung lon nhat la: " + a);
    }
}
