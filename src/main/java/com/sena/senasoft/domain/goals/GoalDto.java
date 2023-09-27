package com.sena.senasoft.domain.goals;

import java.util.Date;

public record GoalDto(
        String description,
        Date start,
        Date finish,
        Long user
) {


    public GoalDto(Goal goal){
            this(
                    goal.getDescription(),
                    goal.getStart(),
                    goal.getFinish(),
                    goal.getUser().getId()
            );
        }
    }

