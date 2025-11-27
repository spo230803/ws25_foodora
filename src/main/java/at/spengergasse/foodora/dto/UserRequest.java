package at.spengergasse.foodora.dto;

import at.spengergasse.foodora.model.richtType.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRequest (
        @NotBlank
        String fullName,
        Email email
) {
}
