package com.sena.senasoft.domain.choice;

import java.util.List;

public interface IChoiceService {

    Choice saveChoice(ChoiceDto choiceDto);

    List<Choice> getChoiceList();

    Choice getChoice(Long id);

    Choice updateChoice(Long id, ChoiceDto choiceDto);

    void deleteChoice(Long id);

    List<Choice> findChoiceByQuestion(Long id);


}
