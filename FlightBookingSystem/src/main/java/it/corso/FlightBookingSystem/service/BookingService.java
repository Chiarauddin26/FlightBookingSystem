package it.corso.FlightBookingSystem.service;

import it.corso.FlightBookingSystem.model.Booking;
import it.corso.FlightBookingSystem.model.Flight;
import it.corso.FlightBookingSystem.model.dto.BookingDto;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    Booking bookFlight(BookingDto bookingDto); //save, salva la prenotazione
    List<Booking> getPassengerBookings(String passengerName); //findByName, lista di prenotazioni effettuate da una persona
    void cancelBooking(Long id); //deleteById, cancella prenotazione
    List<Booking> getFlightBookings(String flightNumber, LocalDate date);
    int getAvailableSeat(String flightNumber, LocalDate date);
    List<Flight> getFlights(String originAirport, String destinationAirport, LocalDate date);

}
