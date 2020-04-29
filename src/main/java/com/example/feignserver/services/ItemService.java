package com.example.feignserver.services;

import com.example.feignserver.dtos.ItemDTO;

public interface ItemService {

    ItemDTO getItemById(final Integer id);
}
