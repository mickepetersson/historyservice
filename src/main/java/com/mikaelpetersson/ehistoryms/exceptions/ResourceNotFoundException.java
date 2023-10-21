package com.mikaelpetersson.ehistoryms.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String field;
    private Object value;

    public ResourceNotFoundException(String firstName, String field, Object value) {
        super(String.format("%s not found with %s : '%s'", firstName, field, value));
        this.firstName = firstName;
        this.field = field;
        this.value = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getField() {
        return field;
    }

    public Object getValue() {
        return value;
    }
}