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
    public ResponseEntity<FormResponseDataDto> saveForm (@RequestBody FormResponseDataDto registerDara){
        return ResponseEntity.ok(formService.saveForm(registerDara));
    }

    @GetMapping
    public ResponseEntity<List<FormListDto>> getFormList(){
        return ResponseEntity.ok(formService.getFormList());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormResponseDataDto> updateForm (@PathVariable Long id, @RequestBody FormUpdateDto updateDto){
        FormResponseDataDto formResponse = formService.update(id, updateDto);
        return ResponseEntity.ok(formResponse);
    }


}
