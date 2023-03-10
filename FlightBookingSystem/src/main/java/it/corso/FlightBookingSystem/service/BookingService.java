package it.corso.FlightBookingSystem.service;

import it.corso.FlightBookingSystem.model.Booking;
import it.corso.FlightBookingSystem.model.dto.BookingDto;

import java.util.List;

public interface BookingService {
    Booking bookFlight(BookingDto bookingDto);
    List<Booking> getPassengerBookings(String passengerName);
    void cancelBooking(Long id);

}
