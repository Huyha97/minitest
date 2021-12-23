package baiTapTOngHop.baingay22_12.bai02;

public class Customer {
    private String name;
    private int address;
    private int code;

    public Customer() {
    }

    public Customer(String name, int address, int code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", code=" + code +
                '}';
    }
}
