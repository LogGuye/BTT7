package hinhhockt;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public hinhvuong() {
        ten = "hinhvuong";
    }

    public void nhapCanh() {
        System.out.print("Nhập cạnh: ");
        Scanner scanner = new Scanner(System.in);
        chieuDai = chieuRong = scanner.nextFloat();
    }
}
