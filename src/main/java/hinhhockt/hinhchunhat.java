package hinhhockt;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float chieuDai;
    public float chieuRong;

    public hinhchunhat() {
        ten = "hinhchunhat";
    }

    public void nhapChieuDai() {
        System.out.print("Nhập chiều dài: ");
        Scanner scanner = new Scanner(System.in);
        chieuDai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.print("Nhập chiều rộng: ");
        Scanner scanner = new Scanner(System.in);
        chieuRong = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * (chieuDai + chieuRong);
    }

    public void tinhDienTich() {
        dienTich = chieuDai * chieuRong;
    }
}
