package com.example.feignserver.controllers;

import com.example.feignserver.dtos.ItemDto;
import com.example.feignserver.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDto> getItem(@PathVariable Integer id) {
        final ItemDto item = itemService.getItemById(id);
        return ResponseEntity.ok(item);
    }

    @GetMapping
    public ResponseEntity<List<ItemDto>> getItems() {
        List<ItemDto> itemDtoList = Stream
                .generate(() -> itemService.getItemById(new Random().nextInt()))
                .limit(10)
                .collect(Collectors.toList());
        return ResponseEntity.ok(itemDtoList);
    }
}
