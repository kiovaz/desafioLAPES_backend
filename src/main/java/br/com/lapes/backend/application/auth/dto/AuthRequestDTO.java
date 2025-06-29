

package br.com.lapes.backend.application.auth.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequestDTO {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
