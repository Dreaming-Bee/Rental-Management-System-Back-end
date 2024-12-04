package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Customer;
import org.example.model.Item;
import org.example.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    final ItemService itemService;

    @PostMapping("/add-customer")
    public void addItem(@RequestBody Item item) {
        itemService.addItem(item);
    }
    @GetMapping("/searchById/{id}")
    public Item searchById(@PathVariable Long id){
        return itemService.searchById(id);
    }

    @DeleteMapping("/delete-id/{id}")
    public void deleteById(@PathVariable Long id){
        itemService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Item item){
        itemService.update(item);
    }

    @GetMapping("/get-all")
    public List<Item> getAll () {
        return itemService.getAll();
    }
}
