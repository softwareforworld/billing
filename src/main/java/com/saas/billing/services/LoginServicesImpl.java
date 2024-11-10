package com.saas.billing.services;

import com.saas.billing.jpa.Login;
import com.saas.billing.repository.LoginRepository;
import com.saas.billing.response.LoginResponse;
import com.saas.billing.utils.BillingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServicesImpl implements LoginServices {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public LoginResponse login(String username, String password) {
        Login login = loginRepository.findByUsername(username);
        if (login != null) {
            if (login.getPassword().equals(password)) {
                return new LoginResponse(BillingUtils.generateTraceID(), "Login Successful", "200");
            }
            return new LoginResponse(null, "Invalid Password", "401");
        }
        return new LoginResponse(null, "Invalid Username", "401");
    }
}
