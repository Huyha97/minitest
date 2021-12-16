
public class StudentManager implements Manager {

    private Student[] students;

    public StudentManager(Student[] students) {
        this.students = students;
    }



    @Override
    public void displayStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    @Override
    public void addStudent() {

    }

    @Override
    public void searchStudent() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void editStudent() {

    }

    @Override
    public void sortStudent() {

    }

    @Override
    public void totalPoint() {

    }
}
