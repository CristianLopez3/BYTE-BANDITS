package com.sena.senasoft.controller;

import com.sena.senasoft.domain.goals.Goal;
import com.sena.senasoft.domain.goals.GoalDto;
import com.sena.senasoft.domain.goals.IGoalService;
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
@RequestMapping("/goal")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearer-key")
@Tag(name = "Goal", description = "User goals")
public class GoalController {
    /**
     * Dependency injection
     */
    private final IGoalService goalService;

    /**
     * Save a choice in the database with its respective question
     * @param goalDto - json body
     * @return
     */
    @Operation(
            summary = "Save a choice in the database with its respective question",
            description = "This method call all choices in the database to make a analysis of the constant choices " +
                    "and make more decisions about the content of the system"
    )
    @PostMapping
    public ResponseEntity<Goal> saveGoal(@RequestBody GoalDto goalDto){
        return ResponseEntity.ok(goalService.saveGoal(goalDto));
    }
    /**
     * This method call all choices in the database to make a analysis of the
     * constant choices and make more decisions about the content of the system
     * @return All resources
     */
    @Operation(
            summary = "This method call all choices in the database to make a analysis of the constant choices " +
                    "and make more decisions about the content of the system",
            description = "This method call all choices in the database to make a analysis of the constant choices " +
                    "and make more decisions about the content of the system")
    @GetMapping
    public ResponseEntity <List<Goal>> getGoalList(){
        return ResponseEntity.ok(goalService.getGoalList());
    }


    @Operation(
            summary = "Get one goal",
            tags = {"GET"}
    )
    @GetMapping("/{id}")
    public ResponseEntity <Goal> getGoal(@PathVariable Long id){
        return ResponseEntity.ok(goalService.getGoal(id));
    }

    @Operation(
            summary = "Update a goal",
            tags = {"PUT"}
    )
    @PutMapping("/{id}")
    public ResponseEntity <Goal> updateGoal(@PathVariable Long id, @RequestBody GoalDto goalDto){
        Goal goalResponse = goalService.updateGoal(id, goalDto);
        return ResponseEntity.ok(goalResponse);
    }

    @Operation(
            summary = "Delete a goal",
            tags = {"DELETE"}
    )
    @DeleteMapping("/{id}")
    public ResponseEntity deleteGoal(@PathVariable Long id){
        goalService.deleteGoal(id);
        return ResponseEntity.noContent().build();
    }
}
