package hinhhockt;

public class Hinhhockt {
    public static void main(String[] args) {

        hinhtron ht = new hinhtron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        hinhtru htru = new hinhtru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.inTheTich();

        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
        
        hinhvuong hv = new hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
}