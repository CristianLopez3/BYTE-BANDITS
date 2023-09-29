package com.sena.senasoft.domain.question;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("""
            select q from Question q where q.form.id = :id
            """)
    List<Question>  findByFormId(Long id);

}
