package com.example.feignserver.services.impl;

import com.example.feignserver.dtos.ItemDTO;
import com.example.feignserver.services.ItemService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ItemServiceImpl implements ItemService {

    @Override
    public ItemDTO getItemById(final Integer id) {
        final ItemDTO itemDTO = new ItemDTO();
        itemDTO.setPropertyInt(id);
        itemDTO.setPropertyInteger(id);
        itemDTO.setPropertyString("string1");
        itemDTO.setPropertyLocalDateTime(LocalDateTime.now());
        return itemDTO;
    }
}
