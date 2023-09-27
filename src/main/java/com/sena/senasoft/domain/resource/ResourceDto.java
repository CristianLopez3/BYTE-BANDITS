package com.sena.senasoft.domain.resource;

import com.sena.senasoft.domain.question.Question;

public record ResourceDto(
        String description,
        String url,
        Long user
) {
    public ResourceDto(Resource resource){
        this(
                resource.getDescription(),
                resource.getUrl(),
                resource.getUser().getId()
        );
    }
}
