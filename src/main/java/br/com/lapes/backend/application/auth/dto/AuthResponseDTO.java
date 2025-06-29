

package br.com.lapes.backend.application.auth.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author KIO
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
 public class AuthResponseDTO {

    private String acessToken;
    private Long acessTokenExpiresIn;           // em ms
    private String refreshToken;
    private Long refreshTokenExpiresIn;         // em ms
    private String tokenType;
    private String userRole;


    
}
