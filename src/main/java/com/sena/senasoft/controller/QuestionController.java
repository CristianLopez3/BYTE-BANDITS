package com.sena.senasoft.controller;

import com.sena.senasoft.domain.form.FormDto;
import com.sena.senasoft.domain.question.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearer-key")
@Tag(name = "question", description = "questions for a form")
public class QuestionController {

    /**
     * Dependency injection
     */
    private final IQuestionService questionService;


    @Operation(
            summary = "Create a new question",
            description = "",
            tags = {"POST"}
    )
    @PostMapping
    public ResponseEntity<Question> saveQuestion (@RequestBody QuestionDto question){
        return ResponseEntity.ok(questionService.saveQuestion(question));
    }


    @Operation(
            summary = "Get the question list of a form",
            description = "",
            tags = {"GET"}
    )
    @GetMapping
    public ResponseEntity <List<Question>> getQuestionListByForm(@RequestBody FormDto form){
        return ResponseEntity.ok(questionService.findQuestionsByForm(form.creator()));
    }


    @Operation(
            summary = "Update a question from a form",
            description = "",
            tags = {"PUT"}
    )
    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestion(
            @PathVariable Long id,
            @RequestBody QuestionDto questionDto
    ){
        return ResponseEntity.ok(questionService.updateQuestion(id, questionDto));
    }



    @Operation(
            summary = "Delete a question from the database",
            description = "",
            tags = {"DELETE"}
    )
    @DeleteMapping("/{id}")
    public ResponseEntity deleteQuestion(@PathVariable Long id){
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }


}
