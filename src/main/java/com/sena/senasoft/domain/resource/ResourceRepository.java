package com.sena.senasoft.domain.resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository <Resource, Long>{
List<Resource> findByUserId(Long id);
}
