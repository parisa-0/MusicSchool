package Model;

import java.util.Date;

public class Bookings {
    String bookingId;
    Instructor instructor;
    Courses courses;
    Date startDate;
    Date endDate;

    public Bookings(String bookingId, Instructor instructor, Courses courses, Date startDate, Date endDate) {
        this.bookingId = bookingId;
        this.instructor = instructor;
        this.courses = courses;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
