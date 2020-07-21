package com.example.feignserver.dtos;

public class ItemDto {

    private Integer id;

    public ItemDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
