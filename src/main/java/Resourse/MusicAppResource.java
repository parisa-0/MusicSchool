package Resourse;

//https://vaadin.com

//https://miacwyan.medium.com/how-to-develop-and-deploy-your-web-app-angular-tomcat-server-mysql-part-3-b332fe10d3e4
/*
utility package and helper class and static method with http client
jakarta ee and microprofile
*/


import Model.Bookings;
import Model.Courses;
import Model.Instructor;
import Service.CourseService;
import Service.InstructorService;

import java.util.Collection;
import java.util.Date;

public class MusicAppResource {
//from service classes
    /*
    book a course
    get instructor course
    find a course between start and end date
    https://stackoverflow.com/questions/1322335/what-is-the-best-java-library-to-use-for-http-post-get-etc
     */

    public static Instructor getInstructor(String instructorId) {
        return InstructorService.getInstructor(instructorId);
    }

    public static void createAnInstructor(String username, String password, String firstName, String lastName, String instructorId, Courses courseId) {
        InstructorService.addInstructor(username, password, firstName, lastName, instructorId, courseId);
    }

    public static Courses getCourses(String courseId) {
        return CourseService.getCourse(courseId);
    }

    public static void bookACourse(Instructor instructor, Courses courses, Date startDate, Date endDate)  {
        //CourseService.bookACourse(instructor, courses, startDate, endDate);
    }
/*
    public static Collection<Bookings> getUserReservation(String email)
    {
        final Customer customer = CustomerService.getCustomer(customerEmail);
        return ReservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public static Collection<IRoom> findARoom(Date checkInDate, Date checkOutDate)
    {
        return ReservationService.findARoom(checkInDate, checkOutDate);
    }

 */

}
