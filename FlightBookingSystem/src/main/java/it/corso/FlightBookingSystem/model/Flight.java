package it.corso.FlightBookingSystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "flight")
@Setter
@Getter
@NoArgsConstructor
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10)
    private String flightNumber;
    private LocalDate flightDate;
    private LocalDateTime departureTime;
    private LocalDateTime landingTime;
    @Column(length = 100)
    private String originAirport;
    @Column(length = 100)
    private String destinationAirport;
    private short totalSeats;

    @OneToMany(mappedBy = "flight")
    private List<Booking> bookings;

}
