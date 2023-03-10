package it.corso.FlightBookingSystem.model.dto;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightDto {
    private Long id;
    private String flightNumber;
    private LocalDate flightDate;
    private LocalDateTime departureTime;
    private LocalDateTime landingTime;
    private String originAirport;
    private String destinationAirport;
    private short totalSeats;
}
