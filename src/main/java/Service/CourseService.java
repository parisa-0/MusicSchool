package Service;

import Model.Bookings;
import Model.Courses;
import Model.Instructor;

import java.util.*;

//https://www.youtube.com/watch?v=FNUdLeGfShU
//https://www.baeldung.com/a-guide-to-java-sockets

public class CourseService {

    Map<Instructor, Courses> coursesInstructorMap = new HashMap<>();

    static Set<Courses> coursesSet = new HashSet<>();
    static List<Bookings> bookings = new LinkedList<>();

    public void addCourse(Courses course) {
        coursesSet.add(course);
    }

    public static Courses getCourse(String courseId) {
        for (Courses courses : coursesSet) {
            if(Courses.getCourseID().equals(courseId)) {
                return courses;
            }
        }
        return null;
    }

    public static void bookACourse(String bookingId, Instructor instructor, Courses courses, Date startDate, Date endDate) {
        Bookings newBooking = new Bookings(bookingId, instructor, courses, startDate, endDate);
        bookings.add(newBooking);
    }


    public Collection<Courses> getAllCourses() {
        return coursesSet;
    }

    public void addCourseForInstructor(Instructor instructor, Courses courses) {
        coursesInstructorMap.put(instructor, courses);
    }

}
