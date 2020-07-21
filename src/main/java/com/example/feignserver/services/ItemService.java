package com.example.feignserver.services;

import com.example.feignserver.dtos.ItemDto;

public interface ItemService {

    ItemDto getItemById(Integer id);
}
