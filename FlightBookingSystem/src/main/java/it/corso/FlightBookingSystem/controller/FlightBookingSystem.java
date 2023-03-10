package it.corso.FlightBookingSystem.controller;


import it.corso.FlightBookingSystem.model.Booking;
import it.corso.FlightBookingSystem.model.dto.BookingDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/booking")
public interface FlightBookingSystem {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    ResponseEntity<Booking> bookFlight(@RequestBody BookingDto bookingDto);

    @GetMapping("getPassengerBookings/{passengerName}")
    ResponseEntity<List<Booking>> getPassengerBookings(@PathVariable(value="passengerName") String passengerName);



}
