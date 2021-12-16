public class Student extends Person {
    private double avgPoint;

    public Student(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

}
