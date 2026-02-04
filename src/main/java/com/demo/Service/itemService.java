package com.demo.Service;
;

import com.demo.Model.item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class itemService {

    private List<item> items = new ArrayList<>();

    public item addItem(item item) {
        items.add(item);
        return item;
    }

    public item getItemById(int id) {
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
