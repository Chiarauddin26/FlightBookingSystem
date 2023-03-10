package it.corso.FlightBookingSystem.service;

import it.corso.FlightBookingSystem.dao.BookingRepository;
import it.corso.FlightBookingSystem.model.Booking;
import it.corso.FlightBookingSystem.model.Flight;
import it.corso.FlightBookingSystem.model.dto.BookingDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    private BookingRepository repository;

    @Autowired
    public BookingServiceImpl(final BookingRepository repository) {
        this.repository=repository;
    }

    @Override
    public Booking bookFlight(BookingDto bookingDto) {
        ModelMapper modelMapper = new ModelMapper();
        return repository.save(modelMapper.map(bookingDto, Booking.class));
    }

    @Override
    public List<Booking> getPassengerBookings(String passengerName) {
        return repository.findByName(passengerName);
    }

    @Override
    public void cancelBooking(Long id) {
        Optional<Booking> optionalBooking = repository.findById(id);
        if (optionalBooking.isPresent()) {
            repository.deleteById(id);
        } else throw new ResourceNotFoundException();
    }

    @Override
    public List<Booking> getFlightBookings(String flightNumber, LocalDate date) {
        return null;
    }

    @Override
    public int getAvailableSeat(String flightNumber, LocalDate date) {
        return 0;
    }

    @Override
    public List<Flight> getFlights(String originAirport, String destinationAirport, LocalDate date) {
        return null;
    }
}
