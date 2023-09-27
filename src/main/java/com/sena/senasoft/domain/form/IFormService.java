package com.sena.senasoft.domain.form;

import com.sena.senasoft.domain.user.*;

import java.util.List;

public interface IFormService {

    Form saveForm(FormDto formDto);

    List<Form> getFormList();

    Form getForm(Long id);

    Form updateForm(Long id, Form formDto);

    void deleteForm(Long id);

}
