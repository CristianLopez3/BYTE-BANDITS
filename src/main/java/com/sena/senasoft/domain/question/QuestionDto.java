package com.sena.senasoft.domain.question;

import com.fasterxml.jackson.annotation.JsonAlias;

public record QuestionDto(
        String description,
        @JsonAlias({"form_Id", "id_form"})
        Long form

) {

    public QuestionDto(Question question){
        this(
                question.getDescription(),
                question.getForm().getId()
        );
    }

}
