package Model;

public class Courses extends Instructor {

    private String courseID;
    public Courses(String username, String password, String firstName, String lastName, String instructorId,String courseID) {
        super(username, password, firstName, lastName, instructorId);
        this.courseID = courseID;
    }
}
