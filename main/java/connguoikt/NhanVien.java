package connguoikt;
public class NhanVien extends ConNguoi {
    private int luong;
    public NhanVien(String hoTen, String diaChi, int luong) {
        super(hoTen, diaChi);
        this.luong = luong;
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    public void hienThiNhanVien() {
        hienThiThongTin();
        System.out.println("Lương: " + luong);
    }
}
