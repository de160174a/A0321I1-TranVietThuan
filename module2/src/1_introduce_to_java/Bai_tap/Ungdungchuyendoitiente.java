package Bai_tap;
import java.util.Scanner;
public class Ungdungchuyendoitiente {
    public static void main(String[] args) {
    double vnd = 23000, usd;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số tiền USD: ");
    usd = sc.nextDouble();
    System.out.println("Giá trị VND: " + usd * vnd);
}
}
