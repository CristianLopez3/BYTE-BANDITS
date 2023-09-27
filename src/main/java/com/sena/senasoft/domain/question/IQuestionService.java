package com.sena.senasoft.domain.question;

import com.sena.senasoft.domain.form.Form;
import com.sena.senasoft.domain.form.FormDto;

import java.util.List;

public interface IQuestionService {

    Question saveQuestion(FormDto formDto);

    List<Question> getFormList();

    Question getQuestion(Long id);

    Question updateQuestion(Long id, QuestionDto questioDto);

    void deleteQuestion(Long id);

    List<Question> findQuestionsByForm(Long id);

}
