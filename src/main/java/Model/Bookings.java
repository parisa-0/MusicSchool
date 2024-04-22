package Model;

import java.util.Date;

public class Bookings {
    Instructor instructor;
    Courses courses;
    Date startDate;
    Date endDate;

    public Bookings(Instructor instructor, Courses courses, Date startDate, Date endDate) {
        this.instructor = instructor;
        this.courses = courses;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
