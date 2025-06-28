
package br.com.lapes.backend.application.auth.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author KIO
 */
@Getter
@Setter
public class RegisterRequestDTO {
    private String name;
    private String email;
    private String password;
}
