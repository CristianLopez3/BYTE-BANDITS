package com.sena.senasoft.domain.question;

import com.sena.senasoft.domain.form.Form;
import com.sena.senasoft.domain.form.FormDto;
import com.sena.senasoft.domain.form.FormRepository;
import com.sena.senasoft.domain.form.IFormService;
import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements IQuestionService {

    private final QuestionRepository questionRepository;
    private final IFormService formService;

    @Override
    public Question saveQuestion(QuestionDto questionDto) {
        Form form = formService.getForm(questionDto.form());
        Question question = new Question();
        question.setDescription(questionDto.description());
        question.setForm(form);
        return questionRepository.save(question);
    }

    @Override
    public Question getQuestion(Long id) {
        Optional<Question> question = questionRepository.findById(id);
        if(question.isEmpty()){
            throw new EntityNotFoundException("Question not found");
        }
        return question.get();
    }

    @Override
    public Question updateQuestion(Long id, QuestionDto questionDto) {
        Optional<Question> question = questionRepository.findById(id);
        if(question.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        Question realQuestion = question.get();
        realQuestion.setDescription(questionDto.description());
        return questionRepository.save(realQuestion);
    }

    @Override
    public void deleteQuestion(Long id) {
        Optional<Question> question = questionRepository.findById(id);
        if(question.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        questionRepository.delete(question.get());
    }

    @Override
    public List<Question> findQuestionsByForm(Long id) {
        return questionRepository.findByFormId(id);
    }


}
