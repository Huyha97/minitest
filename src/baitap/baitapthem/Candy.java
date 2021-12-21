package baitap.baitapthem;

public class Candy {
    private int id;
    private static int VALUE = 0;
    private String color;
    private String property;
    private int quanity;
    private double price;

    public Candy() {
    }

    public Candy( String color, String property, int quanity, double price) {
        this.id = ++VALUE;
        this.color = color;
        this.property = property;
        this.quanity = quanity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getVALUE() {
        return VALUE;
    }

    public static void setVALUE(int VALUE) {
        Candy.VALUE = VALUE;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", property='" + property + '\'' +
                ", quanity=" + quanity +
                ", price=" + price +
                '}';
    }

}
