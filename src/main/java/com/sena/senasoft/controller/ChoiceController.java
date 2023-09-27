package com.sena.senasoft.controller;

import com.sena.senasoft.domain.choice.Choice;
import com.sena.senasoft.domain.choice.ChoiceDto;
import com.sena.senasoft.domain.choice.IChoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/choices")
@RequiredArgsConstructor
public class ChoiceController {

    /**
     * Dependency injection
     */
    private final IChoiceService choiceService;

    /**
     * Save a choice in the database with its respective question
     * @param choiceDto - json body
     * @return
     */
    @PostMapping
    public ResponseEntity <Choice> saveChoice(@RequestBody ChoiceDto choiceDto){
        return ResponseEntity.ok(choiceService.saveChoice(choiceDto));
    }

    /**
     * This method call all choices in the database to make a analysis of the
     * constant choices and make more decisions about the content of the system
     * @return All choice
     */
    @GetMapping
    public ResponseEntity<List<Choice>> getChoiceList(){
        return ResponseEntity.ok(choiceService.getChoiceList());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Choice> updateChoice(
            @PathVariable Long id,
            @RequestBody ChoiceDto choiceDto
    ){
        Choice choiceResponse = choiceService.updateChoice(id, choiceDto);
        return ResponseEntity.ok(choiceResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteChoice(@PathVariable Long id){
        choiceService.deleteChoice(id);
        return ResponseEntity.noContent().build();
    }

}
