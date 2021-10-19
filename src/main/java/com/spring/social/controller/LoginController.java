package com.spring.social.controller;

import com.spring.social.dto.JwtLogin;
import com.spring.social.dto.LoginResponse;
import com.spring.social.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
// http://localhost:8080/auth
public class LoginController {

    private TokenService tokenService;

    @Autowired
    public LoginController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    // http://localhost:8080/auth/login
    @PostMapping("/login")
    public LoginResponse login(@RequestBody JwtLogin jwtLogin) throws Exception {
        return tokenService.login(jwtLogin);
    }
}
