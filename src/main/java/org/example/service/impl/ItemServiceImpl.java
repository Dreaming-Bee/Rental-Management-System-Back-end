package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.CustomerEntity;
import org.example.entity.ItemEntity;
import org.example.model.Customer;
import org.example.model.Item;
import org.example.repository.ItemRepository;
import org.example.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    final ItemRepository itemRepository;
    final ModelMapper modelMapper;
    @Override
    public void addItem(Item item) {
        itemRepository.save(modelMapper.map( item , ItemEntity.class));
    }

    @Override
    public Item searchById(Long id) {
        return modelMapper.map(itemRepository.findById(id), Item.class);
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);

    }

    @Override
    public void update(Item item) {
        itemRepository.save(modelMapper.map(item, ItemEntity.class));
    }

    @Override
    public List<Item> getAll() {
        List<Item> itemList = new ArrayList<>();
        itemRepository.findAll().forEach(ItemEntity -> {
            itemList.add(modelMapper.map(ItemEntity, Item.class));
        });
        return itemList;
    }

}
