package com.demo.Controller;

import com.demo.Model.item;
import com.demo.Service.itemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class itemController {
    private final itemService service;

    public itemController(itemService service) {
        this.service = service;
    }

    // Add new item
    @PostMapping
    public item addItem(@Valid @RequestBody item item) {
        return service.addItem(item);
    }

    // Get item by ID
    @GetMapping("/{id}")
    public item getItem(@PathVariable int id) {
        return service.getItemById(id);
    }
}
