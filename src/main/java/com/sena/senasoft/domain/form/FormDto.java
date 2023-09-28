package com.sena.senasoft.domain.form;

import lombok.Getter;

import java.math.BigInteger;
import java.time.LocalDate;


public record FormDto (
        String title,
        String description,
        LocalDate start,
        LocalDate end,
        Long creator,
        BigInteger score

        ) {

    public FormDto(Form form){
        this(
                form.getTitle(),
                form.getDescription(),
                form.getStart(),
                form.getEnd(),
                form.getCreator().getId(),
                form.getScore()
        );
    }
}
