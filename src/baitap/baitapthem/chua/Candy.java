package baitap.baitapthem.chua;

public class Candy {
    private static int VALUE  = 0;
    private int id;
    private String color;
    private String property;
    private int quanity;
    private double amount;

    public Candy() {
    }

    public Candy( String color, String property, int quanity, double amount) {
        this.id = ++VALUE;
        this.color = color;
        this.property = property;
        this.quanity = quanity;
        this.amount = amount;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", property='" + property + '\'' +
                ", quanity=" + quanity +
                ", amount=" + amount +
                '}';
    }
}
