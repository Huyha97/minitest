package baitap.bai35;

public class Sach extends TacGia {
    private String TenSach;
    private double GiaBan;
    private int namXuatBan;
    private TacGia tacGia;

//    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
//        super();
//        this.TenSach = tenSach;
//        this.GiaBan = giaBan;
//        this.namXuatBan = namXuatBan;
//        this.tacGia = tacGia;
//    }

    public Sach(String tenTacGia, Ngay ngaySinh) {
        super(tenTacGia, ngaySinh);
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double giaBan) {
        GiaBan = giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }
}
