package com.example.Teste.auth.token;

import com.example.Teste.auth.usuario.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class JwtTokenUtil implements Serializable {
    private static final long serialVersionUID = -2550185165626007488L;
    public static final long EXPIRAEMMS = 86400000;

    @Value("${jwt.secret}")
    private String secret;

    public String generateJwtToken(Authentication authentication) {
        Usuario userPrincipal = (Usuario) authentication.getPrincipal();
        Date hoje = new Date();

        return Jwts.bui
    }
}
