package org.example.service;

import org.example.model.Item;
import org.example.model.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);

    Rental searchById(Long id);

    void deleteById(Long id);

    void update(Rental rental);

    List<Rental> getAll();
}
