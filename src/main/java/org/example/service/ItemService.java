package org.example.service;

import org.example.model.Customer;
import org.example.model.Item;

import java.util.List;

public interface ItemService {
    void addItem(Item item);

    Item searchById(Long id);

    void deleteById(Long id);

    void update(Item item);

    List<Item> getAll();
}
