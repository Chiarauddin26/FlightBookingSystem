package it.corso.FlightBookingSystem.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class BookingDto {
    private Long id;
    private LocalDate flightDate;
    private LocalDateTime departureTime;
    private LocalDateTime landingTime;
    private String originAirport;
    private String destinationAirport;
    private short seats;
    private String passengerName;

}
