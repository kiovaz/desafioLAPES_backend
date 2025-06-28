/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.lapes.backend.application.auth.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author KIO
 */
@Getter
@Setter
public class AuthRequestDTO {
    private String email;
    private String password;
}
