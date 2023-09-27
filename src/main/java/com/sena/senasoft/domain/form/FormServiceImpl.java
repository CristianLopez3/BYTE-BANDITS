package com.sena.senasoft.domain.form;




import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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
        return formRepository.findAll();
    }

    @Override
    public Form getForm(Long id) {
        Optional<Form> form = formRepository.findById(id);
        if(form.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        return form.get();
    }

    @Override
    public Form updateForm(Long id, Form formDto) {
        return null;
    }

    @Override
    public void deleteForm(Long id) {

    }
}