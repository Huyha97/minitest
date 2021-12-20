package baitap;

public class Cat extends Animal implements Action{
private String hunt;

    public Cat() {
    }

    public Cat(String hunt) {
        this.hunt = hunt;
    }

    public Cat(String name, int age, double weight, String hunt) {
        super(name, age, weight);
        this.hunt = hunt;
    }

    public String getHunt() {
        return hunt;
    }

    public void setHunt(String hunt) {
        this.hunt = hunt;
    }

    @Override
    public void run() {
        System.out.println("toc do 100km/h");
    }

    @Override
    public String makeSound() {
        return "Meo ...meeo!!!";
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "hunt='" + hunt + '\'' +
                '}';
    }
}
