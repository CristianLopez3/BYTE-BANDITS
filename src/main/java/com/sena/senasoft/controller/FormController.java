package com.sena.senasoft.controller;

import com.sena.senasoft.domain.form.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/form")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearer-key")
@Tag(name = "Form", description = "Form to be submitted")
public class FormController {
    private final FormServiceImpl formService;


    @Operation(
            summary = "Save form",
            description = "Parameters are saved in the form service instance and " +
                    "will be saved in the session instance  when the form is submitted " +
                    " to the form service"
    )
    @PostMapping
    public ResponseEntity<Form> saveForm (@RequestBody FormDto formDto){
        return ResponseEntity.ok(formService.saveForm(formDto));
    }

    @Operation
    (
            summary = "Get form list",
            description = "Returns a list of forms"
    )
    @GetMapping
    public ResponseEntity<List<Form>> getFormList(){
        return ResponseEntity.ok(formService.getFormList());
    }


    @Operation(
            summary = "Get form by id",
            description = "Returns a form by id"
    )
    @PutMapping("/{id}")
    public ResponseEntity<Form> updateForm (
            @PathVariable Long id,
            @RequestBody FormDto updateForm
    ){
        Form formResponse = formService.updateForm(id, updateForm);
        return ResponseEntity.ok(formResponse);
    }


    @Operation(
        summary = "Delete form by id",
        description = "Returns a form by id"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<FormDto> deleteForm (@PathVariable Long id){
        formService.deleteForm(id);
        return ResponseEntity.ok().build();
    }


    @Operation(
            summary = "Get form by id",
            description = "Returns a form by id"
    )
    @GetMapping("/{id}")
    public ResponseEntity<List<Form>> getFormListByCreator(@PathVariable Long id){
        return ResponseEntity.ok(formService.findFormByCreator(id));
    }

}
