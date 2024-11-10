package com.saas.billing.repository;

import com.saas.billing.jpa.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository  extends JpaRepository<Login, Long> {
    Login findByUsername(String username);
}
