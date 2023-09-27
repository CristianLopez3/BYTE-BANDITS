package com.sena.senasoft.domain.choice;

public record ChoiceDto(
        String description,
        Long question
) {
    public ChoiceDto(Choice choice) {
        this(
                choice.getDescription(),
                choice.getId()
        );
    }

}
