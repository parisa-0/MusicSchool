package Model;

public class Instructor extends Person {

    private Courses courseId;

    private String instructorId;
    public Instructor(String username, String password, String firstName, String lastName, String instructorId, Courses courseId) {
        super(username, password, firstName, lastName);
        this.instructorId = instructorId;
        this.courseId = courseId;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }
}
