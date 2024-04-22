package Service;

import Model.Courses;
import Model.Instructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstructorService {

    String username;
    String password;
    String firstName;
    String lastName;
    String instructorId;

    public InstructorService(String username, String password, String firstName, String lastName, String instructorId) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.instructorId = instructorId;
    }

    Set<Instructor> instructorSet = new HashSet<>();

    public void addInstructor(String username, String password, String firstName, String lastName, String instructorId, Courses courseId) {
        Instructor instructor = new Instructor(username, password, firstName, lastName, instructorId, courseId);
        instructorSet.add(instructor);
    }

    public Instructor getInstructor(String instructorId) {
        for (Instructor instructor : instructorSet) {
            if(instructor.getInstructorId().equals(instructorId)) {
                return instructor;
            }
        }
        return null;
    }

    public Collection<Instructor> getAllInstructors() {
        return instructorSet;
    }

}
