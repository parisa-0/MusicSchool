package Model;

public class Students extends Person {
    private String studentId;
    public Students(String username, String password, String firstName, String lastName, String studentId) {
        super(username, password, firstName, lastName);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
