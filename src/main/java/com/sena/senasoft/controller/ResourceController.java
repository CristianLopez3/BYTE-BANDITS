package com.sena.senasoft.controller;

import com.sena.senasoft.domain.resource.IResourceService;
import com.sena.senasoft.domain.resource.Resource;
import com.sena.senasoft.domain.resource.ResourceDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resource")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearer-key")
@Tag(name = "resource", description = "Entity resource represented all material given to the" +
        "users for improved their skills")
public class ResourceController {

    /**
     * Dependency injection
     */
    private final IResourceService resourceService;

    @Operation(
            summary = "Save a choice in the database with its respective question",
            description = "Save a choice in the database with its respective question",
            tags = {"POST"}
    )
    @PostMapping
    public ResponseEntity <Resource> saveResource(@RequestBody ResourceDto resourceDto){
        return ResponseEntity.ok(resourceService.saveResource(resourceDto));
    }
    /**
     * This method call all choices in the database to make a analysis of the
     * constant choices and make more decisions about the content of the system
     * @return All resources
     */
    @Operation(
            summary = "Get all choices in the database",
            description = "Get all choices in the database",
            tags = {"GET"}
    )
    @GetMapping
    public ResponseEntity <List<Resource>> getResourceList(){
        return ResponseEntity.ok(resourceService.getResourceList());
    }

    @Operation(
            summary = "Get a choice in the database",
            description = "",
            tags = {"GET"}
    )
    @GetMapping("/{id}")
    public ResponseEntity <Resource> getResource(@PathVariable Long id){
        return ResponseEntity.ok(resourceService.getResource(id));
    }

    @Operation(
            summary = "Update a choice in the database",
            description = "",
            tags = {"PUT"}
    )
    @PutMapping("/{id}")
    public ResponseEntity <Resource> updateResource(@PathVariable Long id, @RequestBody ResourceDto resourceDto){
        Resource resourceResponse = resourceService.updateResource(id, resourceDto);
        return ResponseEntity.ok(resourceResponse);
    }

    @Operation(
            summary = "Delete a choice in the database",
            description = "",
            tags = {"DELETE"}
    )
    @DeleteMapping("/{id}")
    public ResponseEntity deleteResource(@PathVariable Long id){
        resourceService.deleteResource(id);
        return ResponseEntity.noContent().build();
    }

}
