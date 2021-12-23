package baiTapTOngHop.baingay22_12.bai01;

public class Person {
    private String fullName;
    private String dateOfBirth;
    private int CMND;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, int CMND) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.CMND = CMND;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", CMND=" + CMND +
                '}';
    }
}
