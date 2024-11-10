package com.saas.billing.controller;


import com.saas.billing.jpa.Login;
import com.saas.billing.services.LoginServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/auth")
public class LoginController {

    @Autowired
    private LoginServices loginServices;

    @PostMapping(value = "/v1/perform-login")
    public Object performLogin(@RequestBody Login login) {
        return  loginServices.login(login.getUsername(), login.getPassword());
    }




    @RequestMapping(value = "/v1/hello")
    public Object hello() {
        return "Hello";
    }

    @RequestMapping(value = "/v1/refresh-token")
    public Object refreshToken() {
        return null;
    }

}
