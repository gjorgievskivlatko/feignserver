package com.example.feignserver.controllers;

import com.example.feignserver.dtos.ItemDTO;
import com.example.feignserver.services.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<ItemDTO> getItem(@RequestParam @NotNull @Min(0) final Integer id) {
        final ItemDTO item = itemService.getItemById(id);
        return ResponseEntity.ok(item);
    }
}
