package com.auc.app.aucapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auc.app.aucapi.service.IdeaService;
import com.auc.app.aucapi.entity.Idea;

@RestController
@RequestMapping("/api/idea")
public class IdeaController {
    @Autowired
    private IdeaService ideaService;

    @GetMapping
    public List<Idea> getIdeas() {
        return ideaService.getIdeas();
    }

    @PostMapping
    public Idea createIdea(@RequestBody Idea idea) {
        return ideaService.createIdea(idea);
    }

    
    @PutMapping("/{id}")
    public Idea updateIdea(@PathVariable Long id, @RequestBody Idea idea) {
        return ideaService.updateIdea(id, idea);
    }

    @DeleteMapping("/{id}")
    public void deleteIdea(@PathVariable Long id) {
        ideaService.deleteIdea(id);
    }
}