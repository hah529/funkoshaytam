package com.daw2.funkos.exceptions;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)

public class FunkoConflictException extends RuntimeException {

    public FunkoConflictException(@NotBlank(message = "El nombre no puede estar vacío") @Size(max = 100, message = "Máximo 100 caracteres") String id) { super("Ha habido un conflicto con tu funko con id: "+id); }

}