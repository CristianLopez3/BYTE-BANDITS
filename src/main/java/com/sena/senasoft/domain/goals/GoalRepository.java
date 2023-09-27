package com.sena.senasoft.domain.goals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<Goals, Long> {
    List<Goals> findByUserId(Long id);
}
