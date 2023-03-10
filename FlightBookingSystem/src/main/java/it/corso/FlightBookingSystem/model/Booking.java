package it.corso.FlightBookingSystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
@Setter
@Getter
@NoArgsConstructor
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate flightDate;
    private LocalDateTime departureTime;
    private LocalDateTime landingTime;
    @Column(length = 100)
    private String originAirport;
    @Column(length = 100)
    private String destinationAirport;
    private short seats;
    @Column(length = 30)
    private String passengerName;



}
