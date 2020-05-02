package com.example.feignserver.services.impl;

import com.example.feignserver.dtos.ItemDTO;
import com.example.feignserver.services.ItemService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemServiceImplTest {

    private final ItemService itemService = new ItemServiceImpl();

    @Test
    public void test() {
        final Integer id = 10;

        final ItemDTO item = itemService.getItemById(id);

        assertEquals(id, item.getPropertyInteger());
        assertEquals(id, item.getPropertyInt());
    }
}
