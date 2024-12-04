package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Item;
import org.example.model.Rental;
import org.example.service.ItemService;
import org.example.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
public class RentalController {

    final RentalService rentalService;

    @PostMapping("/add-customer")
    public void addRental(@RequestBody Rental rental) {
        rentalService.addRental(rental);
    }
    @GetMapping("/searchById/{id}")
    public Rental searchById(@PathVariable Long id){
        return rentalService.searchById(id);
    }

    @DeleteMapping("/delete-id/{id}")
    public void deleteById(@PathVariable Long id){
        rentalService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Rental rental){
        rentalService.update(rental);
    }

    @GetMapping("/get-all")
    public List<Rental> getAll () {
        return rentalService.getAll();
    }
}
