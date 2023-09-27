package com.sena.senasoft.domain.question;

import com.sena.senasoft.domain.form.Form;
import com.sena.senasoft.domain.form.FormDto;

import java.util.List;

public interface IQuestionService {

    Question saveQuestion(QuestionDto questionDto);

    List<Question> getFormList();

    Question getQuestion(Long id);

    Question updateQuestion(Long id, QuestionDto questionDto);

    void deleteQuestion(Long id);

    List<Question> findQuestionsByForm(Long id);

}
