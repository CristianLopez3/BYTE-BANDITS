package com.sena.senasoft.domain.form;

import java.time.LocalDate;

public record FormDto (
        String title,
        String description,
        LocalDate start,
        LocalDate end,
        Long id

        ) {

    public FormDto(Form form){
        this(
                form.getTitle(),
                form.getDescription(),
                form.getStart(),
                form.getEnd(),
                form.getCreador().getId()
        );
    }
}
