package com.sena.senasoft.controller;

import com.sena.senasoft.domain.question.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class QuestionController {
    private final IQuestionService questionService;

    @PostMapping
    public ResponseEntity<Question> saveQuestion (@RequestBody QuestionDto question){
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }

    @GetMapping
    public ResponseEntity <List<Question>> getQuestionListByForm(@RequestBody Long form_id){
        return ResponseEntity.ok(questionService.findQuestionsByForm(form_id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(
            @PathVariable Long id,
            @RequestBody QuestionDto questionDto
    ){
        return ResponseEntity.ok(questionService.updateQuestion(id, questionDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteQuestion(@PathVariable Long id){
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }


}
