package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "bill")

public class BillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
