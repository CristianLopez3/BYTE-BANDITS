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
    private final IChoiceService choiceService;

    @PostMapping
    public ResponseEntity <Choice> saveChoice(@RequestBody ChoiceDto choiceDto){
        return ResponseEntity.ok(choiceService.saveChoice(choiceDto));
    }

    @GetMapping
    public ResponseEntity<List<Choice>> getChoiceList(){
        return ResponseEntity.ok(choiceService.getChoiceList());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Choice> updateChoice(@PathVariable Long id, @RequestBody ChoiceDto choiceDto){
        Choice choiceResponse = choiceService.updateChoice(id, updateChoice(choiceDto));
        return ResponseEntity.ok(choiceResponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChoice(@PathVariable Long id){
        choiceService.deleteChoice(id);
        return ResponseEntity.noContent().build();
    }
}
