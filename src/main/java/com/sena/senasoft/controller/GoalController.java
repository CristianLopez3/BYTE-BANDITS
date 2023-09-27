package com.sena.senasoft.controller;

import com.sena.senasoft.domain.goals.Goal;
import com.sena.senasoft.domain.goals.GoalDto;
import com.sena.senasoft.domain.goals.IGoalService;
import com.sena.senasoft.domain.resource.Resource;
import com.sena.senasoft.domain.resource.ResourceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goal")
@RequiredArgsConstructor
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
    @PostMapping
    public ResponseEntity<Goal> saveGoal(@RequestBody GoalDto goalDto){
        return ResponseEntity.ok(goalService.saveGoal(goalDto));
    }
    /**
     * This method call all choices in the database to make a analysis of the
     * constant choices and make more decisions about the content of the system
     * @return All resources
     */
    @GetMapping
    public ResponseEntity <List<Goal>> getGoalList(){
        return ResponseEntity.ok(goalService.getGoalList());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Goal> getGoal(@PathVariable Long id){
        return ResponseEntity.ok(goalService.getGoal(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity <Goal> updateGoal(@PathVariable Long id, @RequestBody GoalDto goalDto){
        Goal goalResponse = goalService.updateGoal(id, goalDto);
        return ResponseEntity.ok(goalResponse);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteGoal(@PathVariable Long id){
        goalService.deleteGoal(id);
        return ResponseEntity.noContent().build();
    }
}
