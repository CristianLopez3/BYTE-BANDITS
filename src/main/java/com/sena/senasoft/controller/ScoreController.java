package com.sena.senasoft.controller;

import com.sena.senasoft.domain.score.IScoreService;
import com.sena.senasoft.domain.score.Score;
import com.sena.senasoft.domain.score.ScoreDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
@RequiredArgsConstructor
public class ScoreController {
    /**
     * Dependency injection
     */
    private final IScoreService scoreService;
    /**
     * Save a choice in the database with its respective question
     * @param scoreDto - json body
     * @return
     */
    @PostMapping
    public ResponseEntity<Score> saveScore(@RequestBody ScoreDto scoreDto) {
        return ResponseEntity.ok(scoreService.saveScore(scoreDto));
    }
    @GetMapping
    public ResponseEntity <List<Score>> getScore() {
        return ResponseEntity.ok(scoreService.getScoreList());
    }
    @GetMapping ("/{id}")
    public ResponseEntity <Score> getScoreById(@PathVariable Long id) {
        return ResponseEntity.ok(scoreService.getScore(id));
    }
}
