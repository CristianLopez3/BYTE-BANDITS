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
    public ResponseEntity<QuestionDto> saveQuestion (@RequestBody question){
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }

    @GetMapping
    public ResponseEntity <List<QuestionDto>> getQuestionList(){
        return ResponseEntity.ok(questionService.getQuestionList());
    }

    @PutMapping
    public ResponseEntity<QuestionDto> updateQuestion(@RequestBody question){
        return ResponseEntity.ok(questionService.updateQuestion(question));
    }

    @DeleteMapping
    public ResponseEntity deleteQuestion(@PathVariable Long id){
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }
}
