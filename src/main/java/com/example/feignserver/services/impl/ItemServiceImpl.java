package com.example.feignserver.services.impl;

import com.example.feignserver.dtos.ItemDto;
import com.example.feignserver.services.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemDto getItemById(Integer id) {
        return new ItemDto(id);
    }
}
