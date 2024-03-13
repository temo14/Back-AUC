package com.auc.app.aucapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auc.app.aucapi.entity.Idea;
import com.auc.app.aucapi.repository.IdeaRepository;

@Service
public class IdeaService {
    @Autowired
    private IdeaRepository ideaRepository;

    public List<Idea> getIdeas() {
        return ideaRepository.findAll();
    }

    public Idea getIdea(Long id) {
        return ideaRepository.findById(id).orElse(null);
    }

    public Idea createIdea(Idea idea) {
        return ideaRepository.save(idea);
    }

    public Idea updateIdea(Long id, Idea updatedIdea) {
        Idea existingIdea = getIdea(id);
        if (existingIdea == null) {
            return null;
        }
        return ideaRepository.save(updatedIdea);
    }

    public void deleteIdea(Long id) {
        ideaRepository.deleteById(id);
    }
}