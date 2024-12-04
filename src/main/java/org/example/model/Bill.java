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
public class Bill {

    private Long billId;
    private Long customerId;
    private String customerName;
    private Long itemId;
    private String itemName;
    private LocalDate dueDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double rental;
    private Double fine;
    private Double totalCost;

}
