package com.tinystripz.tv.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    @GetMapping
    public List<String> getAllContent() {
        // Logic to retrieve content
        return List.of("Content 1", "Content 2");
    }

    @GetMapping("/{id}")
    public String getContentById(@PathVariable String id) {
        // Logic to retrieve content by id
        return "Content " + id;
    }

    @PostMapping
    public String createContent(@RequestBody String content) {
        // Logic to create new content
        return "Created content: " + content;
    }

    @PutMapping("/{id}")
    public String updateContent(@PathVariable String id, @RequestBody String content) {
        // Logic to update content by id
        return "Updated content " + id + " to " + content;
    }

    @DeleteMapping("/{id}")
    public String deleteContent(@PathVariable String id) {
        // Logic to delete content by id
        return "Deleted content " + id;
    }
}