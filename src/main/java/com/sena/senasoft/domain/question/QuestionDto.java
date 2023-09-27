package com.sena.senasoft.domain.question;

public record QuestionDto(
        String description,
        Long form

) {

    public QuestionDto(Question question){
        this(
                question.getDescription(),
                question.getForm().getId()
        );
    }

}
