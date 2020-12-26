package app.utk.ms.controller;

import app.utk.ms.model.LoginRequest;
import app.utk.ms.model.LoginResponse;
import app.utk.ms.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/app/user/auth")
public class LoginController {

    @Qualifier(value = "userService")
    @Autowired
    private UserService userService;

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public LoginResponse login(@RequestBody(required = true) LoginRequest loginRequest, HttpServletRequest request){
        return new LoginResponse();
    }
}
