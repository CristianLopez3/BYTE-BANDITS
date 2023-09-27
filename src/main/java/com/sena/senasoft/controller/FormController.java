package com.sena.senasoft.controller;

import com.sena.senasoft.domain.form.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/form")
@RequiredArgsConstructor
public class FormController {
    private final FormServiceImpl formService;

    @PostMapping
    public ResponseEntity<FormDto> saveForm (@RequestBody FormDto formDto){
        return ResponseEntity.ok(formService.saveForm(formDto));
    }
    @GetMapping
    public ResponseEntity<List<Form>> getFormList(){
        return ResponseEntity.ok(formService.getFormList());
    }
    @PutMapping("/{id}")
    public ResponseEntity<FormDto> updateForm (@PathVariable Long id, @RequestBody FormDto updateForm){
        FormDto formResponse = formService.update(id, updateDto);
        return ResponseEntity.ok(formResponse);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<FormDto> deleteForm (@PathVariable Long id){
        formService.deleteForm(id);
        return ResponseEntity.ok().build();
    }

}
