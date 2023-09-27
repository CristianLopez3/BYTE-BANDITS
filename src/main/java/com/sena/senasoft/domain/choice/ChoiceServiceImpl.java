package com.sena.senasoft.domain.choice;

import com.sena.senasoft.domain.form.Form;
import com.sena.senasoft.domain.question.Question;
import com.sena.senasoft.domain.question.QuestionServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChoiceServiceImpl implements IChoiceService {

    /**
     * Dependency injection
     */
    private final ChoiceRepository choiceRepository;
    private final QuestionServiceImpl questionService;

    @Override
    public Choice saveChoice(ChoiceDto choiceDto) {
        Question question = questionService.getQuestion(choiceDto.question());
        Choice choice = new Choice();
        choice.setDescription(choiceDto.description());
        choice.setQuestion(question);
        return choiceRepository.save(choice);
    }

    @Override
    public List<Choice> getChoiceList() {
        return null;
    }

    @Override
    public Choice getChoice(Long id) {
        Optional<Choice> choice = choiceRepository.findById(id);
        if(choice.isEmpty()){
            throw new EntityNotFoundException("Choice not found");
        }
        return choice.get();
    }

    @Override
    public Choice updateChoice(Long id, ChoiceDto choiceDto) {
        Optional<Choice> choice = choiceRepository.findById(id);
        if(choice.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        Choice realChoice = choice.get();
        realChoice.setDescription(choiceDto.description());
        return choiceRepository.save(realChoice);
    }

    @Override
    public void deleteChoice(Long id) {
        Optional<Choice> choice = choiceRepository.findById(id);
        if(choice.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        choiceRepository.delete(choice.get());
    }

    /**
     * @param id
     * @return list of choices for a given question
     */
    @Override
    public List<Choice> findChoiceByQuestion(Long id) {
        return choiceRepository.findByQuestionId(id);
    }


}
