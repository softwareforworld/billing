package com.saas.billing.services;

import com.saas.billing.response.LoginResponse;

public interface LoginServices {
    LoginResponse login(String username, String password);
}
