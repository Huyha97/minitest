public class Student extends Person {
    private double avgPoint;

    public Student(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Student(String name, int age, int id, double avgPoint) {
        super(name, age, id);
        this.avgPoint = avgPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

}
