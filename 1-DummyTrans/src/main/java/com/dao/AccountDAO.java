package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Long> {
    Account findByNumber(String number);
}