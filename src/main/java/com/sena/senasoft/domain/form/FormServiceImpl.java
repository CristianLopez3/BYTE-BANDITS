package com.sena.senasoft.domain.form;




import com.sena.senasoft.domain.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class FormServiceImpl implements IFormService {

    private final FormRepository formRepository;
    private final UserServiceImpl userService;


    @Override
    public Form saveForm(FormDto formDto) {
        Form form = new Form();
        form.setTitle(formDto.title());
        form.setDescription(formDto.description());
        form.setStart(formDto.start());
        form.setEnd(formDto.end());
        form.setCreador(userService.getUser(formDto.creator()));
        return formRepository.save(form);
    }

    @Override
    public List<Form> getFormList() {
        return null;
    }

    @Override
    public Form getForm(Long id) {
        return null;
    }

    @Override
    public Form updateForm(Long id, Form formDto) {
        return null;
    }

    @Override
    public void deleteForm(Long id) {

    }
}
