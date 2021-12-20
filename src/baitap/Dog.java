package baitap;

public class Dog extends Animal implements Action{
    private String bite;

    public Dog() {
    }

    public Dog(String bite) {
        this.bite = bite;
    }

    public Dog(String name, int age, double weight, String bite) {
        super(name, age, weight);
        this.bite = bite;
    }

    public String getBite() {
        return bite;
    }

    public void setBite(String bite) {
        this.bite = bite;
    }

    @Override
    public void run() {
        System.out.println(" Tốc độ bằng 10km/h");
    }

    @Override
    public String makeSound() {
        return "Gâu, Gâu....";
    }


    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "bite='" + bite + '\'' +
                '}';
    }
}
