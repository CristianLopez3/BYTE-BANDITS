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
        User user = userService.getUser(formDto.creator());
        form.setTitle(formDto.title());
        form.setDescription(formDto.description());
        form.setStart(formDto.start());
        form.setEnd(formDto.end());
        form.setCreator(user);
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
    public Form updateForm(Long id, FormDto formDto) {
        Optional<Form> form = formRepository.findById(id);
        if(form.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        Form realForm = form.get();
        realForm.setTitle(formDto.title());
        realForm.setDescription(formDto.description());
        realForm.setStart(formDto.start());
        realForm.setEnd(formDto.end());
        return formRepository.save(realForm);
    }

    @Override
    public void deleteForm(Long id) {
        Optional<Form> form = formRepository.findById(id);
        if(form.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        formRepository.delete(form.get());
    }

    @Override
    public List<Form> findFormByCreator(Long id) {
        return formRepository.findByCreatorId(id);
    }


}
