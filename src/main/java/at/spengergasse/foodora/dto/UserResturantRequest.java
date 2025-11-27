package at.spengergasse.foodora.dto;

import at.spengergasse.foodora.model.resturant.Restaurant;
import at.spengergasse.foodora.model.richtType.Email;
import jakarta.validation.constraints.NotBlank;

public record UserResturantRequest(
        @NotBlank
        String fullName,
        Email email,
        Restaurant restaurant
) {
}
