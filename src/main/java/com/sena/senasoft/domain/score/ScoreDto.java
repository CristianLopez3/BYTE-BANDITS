package com.sena.senasoft.domain.score;

import com.sena.senasoft.domain.goals.Goal;

public record ScoreDto(
        String points,
        Long user,
        Long form
) {
    public ScoreDto(Score score){
        this(
                score.getPoints(),
                score.getUser().getId(),
                score.getForm().getId()
        );
    }
}
