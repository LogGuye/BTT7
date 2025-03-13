package connguoikt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("Nhập họ và tên: ");
        String tenNhanVien = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChiNhanVien = scanner.nextLine();
        System.out.print("Nhập lương: ");
        int luong = scanner.nextInt();
        scanner.nextLine();
        NhanVien nhanVien = new NhanVien(tenNhanVien, diaChiNhanVien, luong);
        System.out.println("\nThông tin Nhân viên:");
        nhanVien.hienThiNhanVien();
        System.out.println("\nNhập thông tin khách hàng:");
        System.out.print("Nhập họ và tên: ");
        String tenKhachHang = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChiKhachHang = scanner.nextLine();
        System.out.print("Nhập số dư tài khoản: ");
        int soDu = scanner.nextInt();
        KhachHang khachHang = new KhachHang(tenKhachHang, diaChiKhachHang, soDu);
        System.out.println("\nThông tin Khách hàng:");
        khachHang.hienThiKhachHang();
        scanner.close();
    }
}
