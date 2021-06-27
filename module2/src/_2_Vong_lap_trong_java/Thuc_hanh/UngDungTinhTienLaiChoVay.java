package _2_Vong_lap_trong_java.Thuc_hanh;
import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien gui ");
        double so_tien_gui = scanner.nextDouble();
        System.out.print("Nhap ti le lai suat (%/year): ");
        double ti_le_lai_suat = scanner.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int so_thang_gui = scanner.nextInt();
        double so_tien_lai = 0;
        for(int i=0; i < so_thang_gui; i++) {
            so_tien_lai += so_tien_gui * (ti_le_lai_suat/100)/12 * so_thang_gui;
        }
        System.out.println("So tien lai = " + so_tien_lai);
    }
}
