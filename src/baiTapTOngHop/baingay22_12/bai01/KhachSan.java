package baiTapTOngHop.baingay22_12.bai01;

public class KhachSan {
    private int Ngaytro;
    private String loaiPhong;
    private double price;
    private Person person;

    public KhachSan() {
    }

    public KhachSan(int ngaytro) {
        Ngaytro = ngaytro;
    }

    public KhachSan(int ngaytro, String loaiPhong, double price, Person person) {
        this.Ngaytro = ngaytro;
        this.loaiPhong = loaiPhong;
        this.price = price;
        this.person = person;
    }

    public int getNgaytro() {
        return Ngaytro;
    }

    public void setNgaytro(int ngaytro) {
        Ngaytro = ngaytro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson() {
        this.person = person;
    }

    @Override
    public String toString() {
        return "KhachSan{" +
                "Ngaytro=" + Ngaytro +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", price=" + price +
                   "  " + person +
                '}';
    }
}
