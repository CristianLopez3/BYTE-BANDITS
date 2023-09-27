package com.sena.senasoft.domain.goals;

import com.sena.senasoft.domain.resource.Resource;

import java.util.Date;

public record GoalDto(
        String description,
        Date start,
        Date finish,
        Long user
) {
    

    public GoalDto(Goals goals){
            this(
                    goals.getDescription(),
                    goals.getStart(),
                    goals.getFinish(),
                    goals.getUser().getId()
            );
        }
    }

