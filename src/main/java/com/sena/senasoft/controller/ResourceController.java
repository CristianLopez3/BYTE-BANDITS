package com.sena.senasoft.controller;

import com.sena.senasoft.domain.resource.IResourceService;
import com.sena.senasoft.domain.resource.Resource;
import com.sena.senasoft.domain.resource.ResourceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource")
@RequiredArgsConstructor
public class ResourceController {
    /**
     * Dependency injection
     */
    private final IResourceService resourceService;
    /**
     * Save a choice in the database with its respective question
     * @param resourceDto - json body
     * @return
     */
    @PostMapping
    public ResponseEntity <Resource> saveResource(@RequestBody ResourceDto resourceDto){
        return ResponseEntity.ok(resourceService.saveResource(resourceDto));
    }
    /**
     * This method call all choices in the database to make a analysis of the
     * constant choices and make more decisions about the content of the system
     * @return All resources
     */
    @GetMapping
    public ResponseEntity <List<Resource>> getResourceList(){
        return ResponseEntity.ok(resourceService.getResourceList());
    }
    @PutMapping("/{id}")
    public ResponseEntity <Resource> updateResource(@PathVariable Long id, @RequestBody ResourceDto resourceDto){
        Resource resourceResponse = resourceService.updateResource(id, resourceDto);
        return ResponseEntity.ok(resourceResponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteResource(@PathVariable Long id){
        resourceService.deleteResource(id);
        return ResponseEntity.noContent().build();
    }

}
