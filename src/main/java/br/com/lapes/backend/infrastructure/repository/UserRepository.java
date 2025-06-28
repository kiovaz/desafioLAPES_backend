/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.lapes.backend.infrastructure.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lapes.backend.domain.user.User;

/**
 *
 * @author KIO
 */
public interface UserRepository extends JpaRepository<User, UUID>{
    Optional<User> findByEmail(String email); // opctional serve para evitar erro ao retornar null / vai ser usado no login pra buscar o usuário pelo e-mail.
    


    boolean existsByEmail(String email); //  útil na hora do cadastro pra verificar se já existe um usuário com o e-mail informado.
}
