package Resourse;

import Model.Bookings;
import Model.Instructor;

import java.util.Collection;
import java.util.Date;

public class AdminResource {
    public static Collection<Bookings> getBookings(String bookingId)
    {
        final Instructor customer = CustomerService.getCustomer(customerEmail);
        return ReservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public static Collection<IRoom> findARoom(Date checkInDate, Date checkOutDate)
    {
        return ReservationService.findARoom(checkInDate, checkOutDate);
    }

}
