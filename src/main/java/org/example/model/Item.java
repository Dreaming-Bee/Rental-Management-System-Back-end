package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {

    private Long itemId;
    private String itemName;
    private Double rentalPerDay;
    private Double finePerDay;
    private String availability;
}
