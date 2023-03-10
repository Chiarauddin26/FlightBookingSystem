package it.corso.FlightBookingSystem.service;

import it.corso.FlightBookingSystem.model.Booking;
import it.corso.FlightBookingSystem.model.dto.BookingDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public Booking bookFlight(BookingDto bookingDto) {
        return null;
    }

    @Override
    public List<Booking> getPassengerBookings(String passengerName) {
        return null;
    }

    @Override
    public void cancelBooking(Long id) {

    }
}
