package minitest23_12;

public class Student extends Person {
    private double math;
    private double physics;
    private double chemistry;


    public Student() {
    }

    public Student(double math, double physics, double chemistry) {
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public Student(int id, String name, int age, double math, double physics, double chemistry) {
        super(id, name, age);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAveragePoint(double math, double physics, double chemistry) {
        double averagePoint;
       return averagePoint  = this.math + this.chemistry + this.physics;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()
               + "Math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
