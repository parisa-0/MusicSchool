package Model;

public class Instructor extends Person {

    private String instructorId;
    public Instructor(String username, String password, String firstName, String lastName, String instructorId) {
        super(username, password, firstName, lastName);
        this.instructorId = instructorId;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }
}
