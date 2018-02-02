package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

/**
 * @author shi.jiake
 * @time 2018/2/2 11:29
 */
@Service
public class ItemService {

    public Item findById(String id) {
        return new Item(id, "汽车");
    }

    public Item findByName(String name) {
        System.out.println("service");
        return new Item("2", name);
    }
}
