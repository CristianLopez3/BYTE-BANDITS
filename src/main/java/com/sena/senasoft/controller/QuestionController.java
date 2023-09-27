package com.sena.senasoft.controller;

import com.sena.senasoft.domain.form.FormDto;
import com.sena.senasoft.domain.question.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    /**
     * Dependency injection
     */
    private final IQuestionService questionService;

    @PostMapping
    public ResponseEntity<Question> saveQuestion (@RequestBody QuestionDto question){
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }

    /**
     * return the question list of a form
     * @param  form id - json representation "creator"
     * @return
     */
    @GetMapping
    public ResponseEntity <List<Question>> getQuestionListByForm(@RequestBody FormDto form){
        return ResponseEntity.ok(questionService.findQuestionsByForm(form.creator()));
    }

    /**
     * Update a question from a form, but no update the form, only can update the
     * description
     * @param id
     * @param questionDto
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(
            @PathVariable Long id,
            @RequestBody QuestionDto questionDto
    ){
        return ResponseEntity.ok(questionService.updateQuestion(id, questionDto));
    }


    /**
     * Delete a question from the database
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteQuestion(@PathVariable Long id){
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }


}
