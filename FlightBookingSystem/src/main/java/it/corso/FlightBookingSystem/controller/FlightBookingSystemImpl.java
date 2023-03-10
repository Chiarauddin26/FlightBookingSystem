package it.corso.FlightBookingSystem.controller;

import it.corso.FlightBookingSystem.model.Booking;
import it.corso.FlightBookingSystem.model.dto.BookingDto;
import it.corso.FlightBookingSystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class FlightBookingSystemImpl implements FlightBookingSystem{

    private BookingService bookingService;

    @Autowired
    public FlightBookingSystemImpl (final BookingService bookingService) {
        this.bookingService=bookingService;
    }

    @PostMapping()
    @Override
    public ResponseEntity<Booking> bookFlight(@RequestBody BookingDto bookingDto) {
        Booking bookingSaved = bookingService.bookFlight(bookingDto);
        return new ResponseEntity<>(bookingSaved, HttpStatus.CREATED);
    }

    @GetMapping("getPassengerBookings/{passengerName}")
    @Override
    public ResponseEntity<List<Booking>> getPassengerBookings(@PathVariable(value="passengerName") String passengerName) {
        List<Booking> findBookings = bookingService.getPassengerBookings(passengerName);
        return new ResponseEntity<>(findBookings, HttpStatus.FOUND);
    }
}
