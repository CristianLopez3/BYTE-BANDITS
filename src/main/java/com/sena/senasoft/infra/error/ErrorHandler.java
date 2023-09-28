package com.sena.senasoft.infra.error;


import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tryError404(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tryError400(MethodArgumentNotValidException e){
        var errores = e.getFieldErrors().stream().map(DataValidationError::new).toList();
        return ResponseEntity.badRequest().body(errores);
    }

    @ExceptionHandler(IntegrityValidation.class)
    public ResponseEntity errorHandlerIntegrityValidation(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity errorHandlerBussinesValidation(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    private record DataValidationError(String field, String error){
        public DataValidationError(FieldError error) {
            this(error.getField(), error.getDefaultMessage());
        }

    }



}
