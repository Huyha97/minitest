package baitap.bai35;

public class TacGia {
    private String tenTacGia;
    private Ngay ngaySinh;

    public TacGia(String tenTacGia, Ngay ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String gettenTacGia() {
        return tenTacGia;
    }

    public void settenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
