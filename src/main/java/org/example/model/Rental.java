package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Long id;
    private LocalDate dueDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double rental;
    private Double fine;
}
