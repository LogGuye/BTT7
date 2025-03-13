package connguoikt;
public class KhachHang extends ConNguoi {
    private int soDu;
    public KhachHang(String hoTen, String diaChi, int soDu) {
        super(hoTen, diaChi);
        this.soDu = soDu;
    }
    public int getSoDu() {
        return soDu;
    }
    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }
    public void hienThiKhachHang() {
        hienThiThongTin();
        System.out.println("Số dư tài khoản: " + soDu);
    }
}
