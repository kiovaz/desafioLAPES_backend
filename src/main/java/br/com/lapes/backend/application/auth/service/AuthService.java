package br.com.lapes.backend.application.auth.service;

import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.lapes.backend.application.auth.dto.AuthRequestDTO;
import br.com.lapes.backend.application.auth.dto.RegisterRequestDTO;
import br.com.lapes.backend.domain.enums.UserRole;
import br.com.lapes.backend.domain.user.User;
import br.com.lapes.backend.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author KIO
 */

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void  register(RegisterRequestDTO request){
                if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("E-mail já cadastrado");
    }
    
        User user = User.builder()
                .id(UUID.randomUUID())
                .name(request.getName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(UserRole.CUSTOMER)
                .build();

        userRepository.save(user);
    }

    public User login(AuthRequestDTO request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Senha inválida");
        }

        return user;
    }
}

