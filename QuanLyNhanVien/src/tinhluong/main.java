package tinhluong;

import java.util.ArrayList;
import java.util.Scanner;
 
public class main {
 
    public static void main(String[] args) {
        int soNhanVienToanThoiGian, soNhanVienThoiVu;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
         
        System.out.print("Nhập số nhân viên toàn thời gian: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN TOÀN THỜI GIAN");
        for (int i = 0; i < soNhanVienToanThoiGian; i++) {
            System.out.println("Nhập thông tin nhân viên toàn thời gian thứ " + (i + 1) + ": ");
            nhanVien = new NhanVienToanThoiGian();  // lúc này nhanVien là nhân viên toàn thời gian
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.print("Nhập số nhân viên thời vụ: ");
        soNhanVienThoiVu = scanner.nextInt();
        System.out.println("NHẬP THÔNG TIN NHÂN VIÊN THỜI VỤ");
        for (int i = 0; i < soNhanVienThoiVu; i++) {
            System.out.println("Nhập thông tin nhân viên thời vụ thứ " + (i + 1) + ": ");
            nhanVien = new NhanVienThoiVu();    // còn bây giờ nhanVien là nhân viên thời vụ
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.println("THÔNG TIN NHÂN VIÊN");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
 
}
