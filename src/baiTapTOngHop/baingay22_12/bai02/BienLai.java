package baiTapTOngHop.baingay22_12.bai02;

public class BienLai {
    private Customer customer;
    private int oldCode;
    private int newCode;
    private double bill;

    public BienLai() {
    }

    public BienLai(Customer customer, int oldCode, int newCode, double bill) {
        this.customer = customer;
        this.oldCode = oldCode;
        this.newCode = newCode;
        this.bill = bill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldCode() {
        return oldCode;
    }

    public void setOldCode(int oldCode) {
        this.oldCode = oldCode;
    }

    public int getNewCode() {
        return newCode;
    }

    public void setNewCode(int newCode) {
        this.newCode = newCode;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "customer=" + customer +
                ", oldCode=" + oldCode +
                ", newCode=" + newCode +
                ", bill=" + bill +
                '}';
    }
}
