package hinhhockt;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieuCao;

    public hinhtru() {
        ten = "hinhtru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();
        System.out.print("Nhập chiều cao: ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
