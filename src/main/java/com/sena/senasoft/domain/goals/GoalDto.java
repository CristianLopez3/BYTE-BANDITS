package com.sena.senasoft.domain.goals;

import java.util.Date;

public record GoalDto(
        String description,
        Date start,
        Date finish,
        Long user
) {


    public GoalDto(Goal goals){
            this(
                    goals.getDescription(),
                    goals.getStart(),
                    goals.getFinish(),
                    goals.getUser().getId()
            );
        }
    }

