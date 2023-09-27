package com.sena.senasoft.domain.choice;

public record ChoiceDto(
        String description,
        Long choice
) {
    public ChoiceDto(Choice choice) {
        this(
                choice.getDescription(),
                choice.getId()
        );
    }
}
