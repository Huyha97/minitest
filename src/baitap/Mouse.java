package baitap;

public class Mouse extends Animal implements Action{
    private String eat;

    public Mouse() {
    }

    public Mouse(String eat) {
        this.eat = eat;
    }

    public Mouse(String name, int age, double weight, String eat) {
        super(name, age, weight);
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }



    @Override
    public void run() {
        System.out.println(" tốc độ 20ikm/h");
    }

    @Override
    public String makeSound() {
        return "chít chít!!!";
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString() +
                "eat='" + eat + '\'' +
                '}';
    }
}
