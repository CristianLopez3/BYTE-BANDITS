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

    /**
     * Save form
     * Parameters are saved in the form service instance and will be saved in the
     * session instance  when the form is submitted  to the form service
     * @param formDto
     * @return
     */
    @PostMapping
    public ResponseEntity<Form> saveForm (@RequestBody FormDto formDto){
        return ResponseEntity.ok(formService.saveForm(formDto));
    }

    /**
     * Return all forms if the user is admin
     * @Parameter
     * @return List of all forms
     */
    @GetMapping
    public ResponseEntity<List<Form>> getFormList(){
        return ResponseEntity.ok(formService.getFormList());
    }

    /**
     * Return form by id
     * @Parameter form id and body to update
     * @return Form
     */
    @PutMapping("/{id}")
    public ResponseEntity<Form> updateForm (
            @PathVariable Long id,
            @RequestBody FormDto updateForm
    ){
        Form formResponse = formService.updateForm(id, updateForm);
        return ResponseEntity.ok(formResponse);
    }


    /**
     * Return form by id
     * @Parameter form id
     * @return Form
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<FormDto> deleteForm (@PathVariable Long id){
        formService.deleteForm(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<List<Form>> getFormListByCreator(@PathVariable Long id){
        return ResponseEntity.ok(formService.findFormByCreator(id));
    }

}
