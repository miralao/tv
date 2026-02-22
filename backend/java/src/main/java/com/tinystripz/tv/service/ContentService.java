package com.tinystripz.tv.service;

import java.util.List;
import java.util.Optional;

public class ContentService {

    // Mock repository for demonstration purposes
    private List<Content> contentRepository;

    public ContentService(List<Content> contentRepository) {
        this.contentRepository = contentRepository;
    }

    // Business logic to retrieve all content
    public List<Content> getAllContent() {
        return contentRepository;
    }

    // Business logic to find content by ID
    public Optional<Content> getContentById(int id) {
        return contentRepository.stream().filter(content -> content.getId() == id).findFirst();
    }

    // Business logic to add new content
    public void addContent(Content content) {
        contentRepository.add(content);
    }

    // Business logic to update existing content
    public void updateContent(int id, Content updatedContent) {
        for (int i = 0; i < contentRepository.size(); i++) {
            if (contentRepository.get(i).getId() == id) {
                contentRepository.set(i, updatedContent);
            }
        }
    }

    // Business logic to delete content
    public void deleteContent(int id) {
        contentRepository.removeIf(content -> content.getId() == id);
    }
}

class Content {
    private int id;
    private String title;
    private String description;

    public Content(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
}