package hinhhockt;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float banKinh;

    public hinhtron() {
        ten = "hinhtron";
    }

    public void nhapBanKinh() {
        System.out.print("Nhập bán kính: ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
