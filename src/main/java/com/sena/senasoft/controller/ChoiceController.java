package com.sena.senasoft.controller;

import com.sena.senasoft.domain.choice.Choice;
import com.sena.senasoft.domain.choice.ChoiceDto;
import com.sena.senasoft.domain.choice.IChoiceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/choices")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearer-key")
@Tag(name = "Choice",
    description = "Operations about choices")
public class ChoiceController {

    /**
     * Dependency injection
     */
    private final IChoiceService choiceService;

    @Operation(
            summary = "Create a new choice",
            description = "Create a new choice"
    )
    @PostMapping
    public ResponseEntity <Choice> saveChoice(@RequestBody ChoiceDto choiceDto){
        return ResponseEntity.ok(choiceService.saveChoice(choiceDto));
    }


    @Operation(
            summary = "Get all choices",
            description = "Get all choices"
    )
    @GetMapping
    public ResponseEntity<List<Choice>> getChoiceList(){
        return ResponseEntity.ok(choiceService.getChoiceList());
    }

    @Operation(
            summary = "Get a choice",
            description = "Get a choice"
    )
    @PutMapping("/{id}")
    public ResponseEntity<Choice> updateChoice(
            @PathVariable Long id,
            @RequestBody ChoiceDto choiceDto
    ){
        Choice choiceResponse = choiceService.updateChoice(id, choiceDto);
        return ResponseEntity.ok(choiceResponse);
    }

    @Operation(
            summary = "Delete a choice",
            description = "Delete a choice"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity deleteChoice(@PathVariable Long id){
        choiceService.deleteChoice(id);
        return ResponseEntity.noContent().build();
    }

}
