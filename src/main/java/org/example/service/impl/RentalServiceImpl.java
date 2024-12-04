package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.ItemEntity;
import org.example.entity.RentalEntity;
import org.example.model.Item;
import org.example.model.Rental;
import org.example.repository.RentalRepository;
import org.example.service.RentalService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final RentalRepository rentalRepository;
    final ModelMapper modelMapper;


    @Override
    public void addRental(Rental rental) {
        rentalRepository.save(modelMapper.map( rental , RentalEntity.class));
    }

    @Override
    public Rental searchById(Long id) {
        return modelMapper.map(rentalRepository.findById(id), Rental.class);
    }

    @Override
    public void deleteById(Long id) {
        rentalRepository.deleteById(id);
    }

    @Override
    public void update(Rental rental) {
        rentalRepository.save(modelMapper.map(rental, RentalEntity.class));
    }

    @Override
    public List<Rental> getAll() {
        List<Rental> rentalList = new ArrayList<>();
        rentalRepository.findAll().forEach(RentalEntity -> {
            rentalList.add(modelMapper.map(RentalEntity, Rental.class));
        });
        return rentalList;
    }
}
