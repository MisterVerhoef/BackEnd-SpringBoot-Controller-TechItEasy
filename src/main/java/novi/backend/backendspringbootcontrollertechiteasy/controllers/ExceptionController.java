package novi.backend.backendspringbootcontrollertechiteasy.controllers;

import novi.backend.backendspringbootcontrollertechiteasy.exceptions.RecordNotFoundException;
import novi.backend.backendspringbootcontrollertechiteasy.exceptions.TelevisionNameTooLongException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionController {

@ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
}

    @ExceptionHandler(value = IndexOutOfBoundsException.class)
    public ResponseEntity<Object> exception(IndexOutOfBoundsException exception) {

        return new ResponseEntity<>("Dit id staat niet in de database", HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(value = TelevisionNameTooLongException.class)
    public ResponseEntity<String> exception(TelevisionNameTooLongException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
