package com.auc.app.aucapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auc.app.aucapi.entity.Idea;

public interface IdeaRepository extends JpaRepository<Idea, Long> {
}