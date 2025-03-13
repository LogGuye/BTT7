package connguoikt;
public class ConNguoi {
    private String hoTen;
    private String diaChi;
    public ConNguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void hienThiThongTin() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
    }
}
