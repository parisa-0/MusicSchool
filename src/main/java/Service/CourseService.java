package Service;

import Model.Bookings;
import Model.Courses;
import Model.Instructor;

import java.util.*;

//https://www.youtube.com/watch?v=FNUdLeGfShU
//https://www.baeldung.com/a-guide-to-java-sockets

public class CourseService {

    Map<Instructor, Courses> coursesInstructorMap = new HashMap<>();

    Set<Courses> coursesSet = new HashSet<>();
    List<Bookings> bookings = new LinkedList<>();

    public void addCourse(Courses course) {
        coursesSet.add(course);
    }

    public Courses getCourse(String courseId) {
        for (Courses courses : coursesSet) {
            if(Courses.getCourseID().equals(courseId)) {
                return courses;
            }
        }
        return null;
    }

    public void bookACourse(Instructor instructor, Courses courses, Date startDate, Date endDate) {
        Bookings newBooking = new Bookings(instructor, courses, startDate, endDate);
        bookings.add(newBooking);
    }


    public Collection<Courses> getAllCourses() {
        return coursesSet;
    }

    public void addCourseForInstructor(Instructor instructor, Courses courses) {
        coursesInstructorMap.put(instructor, courses);
    }

}
